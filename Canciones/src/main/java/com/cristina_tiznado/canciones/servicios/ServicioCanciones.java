package com.cristina_tiznado.canciones.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristina_tiznado.canciones.modelos.Cancion;
import com.cristina_tiznado.canciones.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {

    @Autowired
    private RepositorioCanciones repositorioCanciones;

    public List<Cancion> obtenerTodasLasCanciones(){
        return this.repositorioCanciones.findAll();
    }

    public Cancion obtenerCancionPorId(Long Id){
        return this.repositorioCanciones.findById(Id).orElse(null);
    }

    
}
