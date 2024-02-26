package com.angel.TendaRoba.Rest;

import com.angel.TendaRoba.Entidades.Ropa;
import com.angel.TendaRoba.Interfaces.RopaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResRopa {
    @Autowired
    RopaRepository ropaRepository;
    @GetMapping("/ropa")
    public List<Ropa> llistaropa() {
        return (List<Ropa>) ropaRepository.findAll();
    }
}
