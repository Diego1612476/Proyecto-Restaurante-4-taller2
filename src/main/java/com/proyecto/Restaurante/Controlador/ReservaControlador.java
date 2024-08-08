package com.proyecto.Restaurante.Controlador;

import com.proyecto.Restaurante.Entidad.Reserva;
import com.proyecto.Restaurante.Servicio.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ReservaControlador {

    @Autowired
    ReservaServicio reservaServicio;

    //LEER
    @GetMapping("/reservas")
    public String mostrarReservas(Model model){
        List<Reserva> reservas = reservaServicio.listarReservas();
        model.addAttribute("reservas", reservas);
        return "/Reserva/reservasLista";
    }
    //crear
    @GetMapping("/formulario")
    public String formularioReserva(Model model){
        model.addAttribute("reserva", new Reserva());
        return "/Reserva/formulario";
    }

    @PostMapping("/ingresar")
    public String crearReserva(Reserva reserva){
        reservaServicio.guardarReserva(reserva);
        return "redirect:/reservas";
    }
    //Actualizar
    @GetMapping("/editar/{id}")
    public String actualizarReserva(@PathVariable Long id, Model model){
        Optional<Reserva> reserva=reservaServicio.buscarReserva(id);
        model.addAttribute("reserva", reserva);
        return "/Reserva/formulario";
    }
    //ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Long id){
        reservaServicio.eliminarReserva(id);
        return "redirect:/reservas";
    }
}
