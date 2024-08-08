package com.proyecto.Restaurante.Entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size (min = 2, max = 100)
    private String nombre;

    @NotNull
    @Min(1)
    @Max(20)
    private int numeroPersonas;

    @NotNull
    private LocalDate fechaReserva;

    @NotNull
    private LocalTime horaReserva;

    @NotNull
    @Size(min = 5, max=15)
    private String contacto;

    @OneToMany(mappedBy = "reserva")
    private List<Factura> facturas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull @Size(min = 2, max = 100) String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull @Size(min = 2, max = 100) String nombre) {
        this.nombre = nombre;
    }

    @NotNull
    @Min(1)
    @Max(20)
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(@NotNull @Min(1) @Max(20) int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public @NotNull LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(@NotNull LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public @NotNull LocalTime getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(@NotNull LocalTime horaReserva) {
        this.horaReserva = horaReserva;
    }

    public @NotNull @Size(min = 5, max = 15) String getContacto() {
        return contacto;
    }

    public void setContacto(@NotNull @Size(min = 5, max = 15) String contacto) {
        this.contacto = contacto;
    }
}
