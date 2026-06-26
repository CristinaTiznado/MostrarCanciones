package com.cristina_tiznado.canciones.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cristina_tiznado.canciones.servicios.ServicioCanciones;

@Controller
public class ControladorCanciones {

    @Autowired
    private ServicioCanciones servicio;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model modelo){
        modelo.addAttribute("listaCanciones", this.servicio.obtenerTodasLasCanciones());
        return "canciones.jsp";
    }

    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable("idCancion") Long Id, Model modelo){
        modelo.addAttribute("cancion", this.servicio.obtenerCancionPorId(Id));
        return "detalleCancion.jsp";
    }
}
