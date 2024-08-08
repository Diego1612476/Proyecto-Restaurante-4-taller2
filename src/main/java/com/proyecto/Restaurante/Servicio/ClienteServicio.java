package com.proyecto.Restaurante.Servicio;

import com.proyecto.Restaurante.Entidad.Cliente;
import com.proyecto.Restaurante.Repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

    public Optional<Cliente> buscarCliente(Long id) {
        return clienteRepositorio.findById(id);
    }

    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepositorio.deleteById(id);
    }
}
