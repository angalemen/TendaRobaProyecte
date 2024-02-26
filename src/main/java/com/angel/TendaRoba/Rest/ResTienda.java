package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Tienda;
import com.angel.TendaRoba.Interfaces.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResTienda {
    @Autowired
    TiendaRepository tiendaRepository;
    @GetMapping("/tienda")
    public List<Tienda> llistatenda() {
        return (List<Tienda>) tiendaRepository.findAll();
    }
}
