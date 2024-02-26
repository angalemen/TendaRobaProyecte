package com.angel.TendaRoba.Controllers;

import com.angel.TendaRoba.Entidades.Ropa;
import com.angel.TendaRoba.Entidades.Tienda;
import com.angel.TendaRoba.Interfaces.RopaRepository;
import com.angel.TendaRoba.Interfaces.TiendaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerTienda {
    private final TiendaRepository tiendaRepository;

    public ControllerTienda(TiendaRepository tiendaRepository) {
        this.tiendaRepository = tiendaRepository;
    }

    @GetMapping("/tienda")
    public String home(Model model) {
        Iterable<Tienda> tiendas = tiendaRepository.findAll();
        model.addAttribute("tiendas", tiendas);
        return "ListaTienda";
    }

    @GetMapping("/tienda/{id}")
    public String tiendaDetalls(@PathVariable int id, Model model) {
        Tienda tienda = tiendaRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("TENDA no trobada amb id: " + id));
        model.addAttribute("tiendas", tienda);
        return "InfoTienda";
    }
}

