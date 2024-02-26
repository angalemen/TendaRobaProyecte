package com.angel.TendaRoba.Interfaces;

import com.angel.TendaRoba.Entidades.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
    @Override
    Optional<Cliente> findById(Integer integer);


}
