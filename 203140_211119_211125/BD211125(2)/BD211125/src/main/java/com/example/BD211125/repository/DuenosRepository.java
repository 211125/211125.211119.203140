package com.example.BD211125.repository;

import com.example.BD211125.model.Duenos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuenosRepository  extends CrudRepository<Duenos, Long> {
}


