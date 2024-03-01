package com.angel.TendaRoba.Interfaces;

import com.angel.TendaRoba.Entidades.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer> {
    @Override
    Optional<Cliente> findById(Integer integer);


}
