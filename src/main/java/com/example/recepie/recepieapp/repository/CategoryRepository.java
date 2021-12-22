package com.example.recepie.recepieapp.repository;

import jdk.jfr.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {


        Optional<com.example.recepie.recepieapp.domain.Category> findByDescription(String description);
}
