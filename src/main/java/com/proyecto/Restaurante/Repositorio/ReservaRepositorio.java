package com.proyecto.Restaurante.Repositorio;

import com.proyecto.Restaurante.Entidad.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {
}
