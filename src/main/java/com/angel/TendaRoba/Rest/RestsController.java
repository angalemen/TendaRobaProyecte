package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Direccion;
import com.angel.TendaRoba.Entidades.Ropa;
import com.angel.TendaRoba.Entidades.Tienda;
import com.angel.TendaRoba.Interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class    RestsController {
    @Autowired
    RopaRepository ropaRepository;
    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    DireccionRepository direccionRepository;
    @Autowired
    TiendaRepository tiendaRepository;
    @Autowired
    TiendaRopaRepository tiendaRopaRepository;
    @GetMapping("/ropas")
    public List<Ropa> llistaropa() {
        return (List<Ropa>) ropaRepository.findAll();
    }

    @GetMapping("/tiendas")
    public List<Tienda> llistatienda() {
        return (List<Tienda>) tiendaRepository.findAll();
    }

    @GetMapping("/direccions")
    public List<Direccion> llistadireccio() {
        return (List<Direccion>) direccionRepository.findAll();
    }

    @GetMapping("/clientes")
    public List<Direccion> llistatcliente() {
        return (List<Direccion>) direccionRepository.findAll();
    }

    public RestsController(RopaRepository ropaRepository, ClienteRepository clienteRepository, DireccionRepository direccionRepository, TiendaRepository tiendaRepository, TiendaRopaRepository tiendaRopaRepository) {
        this.ropaRepository = ropaRepository;
        this.clienteRepository = clienteRepository;
        this.direccionRepository = direccionRepository;
        this.tiendaRepository = tiendaRepository;
        this.tiendaRopaRepository = tiendaRopaRepository;
    }
}

