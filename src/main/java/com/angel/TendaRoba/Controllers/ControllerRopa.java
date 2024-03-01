package com.angel.TendaRoba.Controllers;


import com.angel.TendaRoba.Entidades.Ropa;
import com.angel.TendaRoba.Interfaces.RopaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerRopa {
    private final RopaRepository ropaRepository;

    public ControllerRopa(RopaRepository ropaRepository) {
        this.ropaRepository = ropaRepository;
    }

    @GetMapping("/ropa")
    public String home(Model model) {
        Iterable<Ropa> ropas = ropaRepository.findAll();
        model.addAttribute("ropas", ropas);
        return "ListaRopa";
    }
    @GetMapping("/ropa/{id}")
    public String ropaDetalls(@PathVariable int id, Model model){
        Ropa ropa= ropaRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Ciutat no trobada amb id: "+id));
        model.addAttribute("ropas", ropa);
        return "InfoRopa";
    }
}