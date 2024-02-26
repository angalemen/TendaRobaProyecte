package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Direccion;
import com.angel.TendaRoba.Interfaces.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/direccionRes")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class RestDireccio {
    @Autowired
    DireccionRepository direccionRepository;
@GetMapping
    public List<Direccion> llistadirec() {
        return (List<Direccion>) direccionRepository.findAll();
    }
}
