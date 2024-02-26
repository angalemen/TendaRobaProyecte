package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Cliente;
import com.angel.TendaRoba.Interfaces.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clienteRes")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class RestCliente {

    @Autowired
    ClienteRepository clienteRepository;
@GetMapping("/client")
    public List<Cliente> llistaclients() {
        return (List<Cliente>) clienteRepository.findAll();
    }
}
