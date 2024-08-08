package com.proyecto.Restaurante.Servicio;

import com.proyecto.Restaurante.Entidad.Reserva;
import com.proyecto.Restaurante.Repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServicio {

    @Autowired
    ReservaRepositorio reservaRepositorio;

    public List<Reserva> listarReservas(){
        return reservaRepositorio.findAll();
    }

    public Optional<Reserva> buscarReserva(Long id){
        return reservaRepositorio.findById(id);
    }

    public void guardarReserva(Reserva reserva){
        reservaRepositorio.save(reserva);
    }

    public void eliminarReserva(Long id){
        reservaRepositorio.deleteById(id);
    }
}
