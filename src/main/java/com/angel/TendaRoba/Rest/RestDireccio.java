package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Direccion;
import com.angel.TendaRoba.Interfaces.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestDireccio {
    @Autowired
    DireccionRepository direccionRepository;
@GetMapping("/direccion")
    public List<Direccion> llistadirec() {
        return (List<Direccion>) direccionRepository.findAll();
    }
}
