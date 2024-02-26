package com.angel.TendaRoba.Controllers;

import com.angel.TendaRoba.Entidades.Direccion;
import com.angel.TendaRoba.Entidades.Ropa;
import com.angel.TendaRoba.Interfaces.DireccionRepository;
import com.angel.TendaRoba.Interfaces.RopaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerDireccio {
    private final DireccionRepository direccionRepository;

    public ControllerDireccio(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    @GetMapping("/direccion")
    public String home(Model model) {
        Iterable<Direccion> direccions = direccionRepository.findAll();
        model.addAttribute("direciones", direccions);
        return "ListaDireccion";
    }

    @GetMapping("/direccion/{id}")
    public String direcDetalls(@PathVariable int id, Model model){
        Direccion direccion= direccionRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Ciutat no trobada amb id: "+id));
        model.addAttribute("direcciones", direccion);
        return "InfoDireccio";
    }


}
