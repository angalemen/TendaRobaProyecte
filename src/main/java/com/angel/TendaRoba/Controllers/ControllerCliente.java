package com.angel.TendaRoba.Controllers;

import com.angel.TendaRoba.Entidades.Cliente;
import com.angel.TendaRoba.Entidades.Direccion;
import com.angel.TendaRoba.Interfaces.ClienteRepository;
import com.angel.TendaRoba.Interfaces.DireccionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerCliente {
    private final ClienteRepository clienteRepository;

    public ControllerCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/cliente")
    public String home(Model model) {
        Iterable<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("clientes", clientes);
        return "ListaClientes";
    }
    @GetMapping("/cliente/{id}")
    public String clienteDetalls(@PathVariable int id, Model model){
        Cliente clientes= clienteRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Cliente no trobada amb id: "+id));
        model.addAttribute("clientes", clientes);
        return "InfoCliente";
    }
}
