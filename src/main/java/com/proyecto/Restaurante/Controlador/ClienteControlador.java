package com.proyecto.Restaurante.Controlador;

import com.proyecto.Restaurante.Entidad.Cliente;
import com.proyecto.Restaurante.Servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClienteControlador {
    @Autowired
    private ClienteServicio clienteServicio;

     @GetMapping("/clientes")
      public String mostrarClientes(Model model){
         List<Cliente> clientes = clienteServicio.listarClientes();
        model.addAttribute("clientes", clientes);
         return "/Reserva/Clientes/vistaClientes";
      }

    //rear
     @GetMapping("/clienteFormulario")
      public String formularioCliente(Model model){
          model.addAttribute("cliente", new Cliente());
         return "/Reserva/Clientes/formularioClientes";
     }

     @PostMapping("/guardarCliente")
     public String crearCliente(Cliente cliente){
        clienteServicio.guardarCliente(cliente);
        return "redirect:/Reserva/Clientes/vistaClientes";  }

}


