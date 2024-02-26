package com.angel.TendaRoba.Interfaces;

import com.angel.TendaRoba.Entidades.Cliente;
import com.angel.TendaRoba.Entidades.TiendaRopa;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TiendaRopaRepository extends CrudRepository<TiendaRopa,Integer> {
    @Override
    Optional<TiendaRopa> findById(Integer integer);

}