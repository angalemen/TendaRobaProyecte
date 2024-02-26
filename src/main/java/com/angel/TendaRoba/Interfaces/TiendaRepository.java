package com.angel.TendaRoba.Interfaces;


import com.angel.TendaRoba.Entidades.Tienda;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TiendaRepository extends CrudRepository<Tienda,Integer> {
    @Override
    Optional<Tienda> findById(Integer integer);


}
