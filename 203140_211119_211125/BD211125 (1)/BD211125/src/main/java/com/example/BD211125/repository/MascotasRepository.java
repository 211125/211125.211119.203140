package com.example.BD211125.repository;

import com.example.BD211125.model.Mascotas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends CrudRepository<Mascotas, Long> {
}