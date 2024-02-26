package com.angel.TendaRoba.Interfaces;

import com.angel.TendaRoba.Entidades.Cliente;
import com.angel.TendaRoba.Entidades.Direccion;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DireccionRepository extends CrudRepository<Direccion,Integer> {
    @Override
    Optional<Direccion> findById(Integer integer);


}
