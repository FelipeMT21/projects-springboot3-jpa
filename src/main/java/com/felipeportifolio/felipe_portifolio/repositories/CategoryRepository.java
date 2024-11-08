package com.felipeportifolio.felipe_portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipeportifolio.felipe_portifolio.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
