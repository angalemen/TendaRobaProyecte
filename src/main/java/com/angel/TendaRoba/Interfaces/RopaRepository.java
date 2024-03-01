package com.angel.TendaRoba.Interfaces;


import com.angel.TendaRoba.Entidades.Ropa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RopaRepository extends CrudRepository<Ropa,Integer> {
    @Override
    Optional<Ropa> findById(Integer integer);


}
