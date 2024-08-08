package com.proyecto.Restaurante.Repositorio;

import com.proyecto.Restaurante.Entidad.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura, Long> {
    List<Factura> findByNumeroFactura(String numeroFactura);

}
