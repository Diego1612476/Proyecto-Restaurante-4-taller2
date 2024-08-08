package com.proyecto.Restaurante.Controlador;

import com.proyecto.Restaurante.Entidad.Reserva;
import com.proyecto.Restaurante.Servicio.FacturaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FacturaControlador {
    @Autowired
    private FacturaServicio facturaServicio;

    @GetMapping("/facturas")
    public String buscarReservasByFactura(@RequestParam(value = "numeroFactura", required = false) String numeroFactura, Model model) {
        if (numeroFactura != null && !numeroFactura.isEmpty()) {
            List<Reserva> reservas = facturaServicio.buscarReservasPorFactura(numeroFactura);
            model.addAttribute("reservas", reservas);
        }
        return "/Reserva/Factura/vistaFactura";
    }
}
