package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Ropa;
import com.angel.TendaRoba.Interfaces.RopaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ropaRes")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ResRopa {
    @Autowired
    RopaRepository ropaRepository;
    @GetMapping
    public List<Ropa> llistaropa() {
        return (List<Ropa>) ropaRepository.findAll();
    }
}
