package com.proyecto.Restaurante.Servicio;

import com.proyecto.Restaurante.Entidad.Factura;
import com.proyecto.Restaurante.Entidad.Reserva;
import com.proyecto.Restaurante.Repositorio.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacturaServicio {

    @Autowired
    private FacturaRepositorio facturaRepositorio;


    public List<Reserva> buscarReservasPorFactura(String numeroFactura) {
        return facturaRepositorio.findByNumeroFactura(numeroFactura).stream()
                .map(Factura::getReserva)
                .collect(Collectors.toList());

    }
}
