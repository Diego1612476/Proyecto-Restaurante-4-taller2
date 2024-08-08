package com.proyecto.Restaurante.Entidad;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Factura {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String numeroFactura;

        private Double precio;


        @ManyToOne
        @JoinColumn(name = "id_cliente")
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "id_reserva")
        private Reserva reserva;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}

