package com.felipeportifolio.felipe_portifolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipeportifolio.felipe_portifolio.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
