package com.angel.TendaRoba.Interfaces;


import com.angel.TendaRoba.Entidades.Ropa;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RopaRepository extends CrudRepository<Ropa,Integer> {
    @Override
    Optional<Ropa> findById(Integer integer);


}
