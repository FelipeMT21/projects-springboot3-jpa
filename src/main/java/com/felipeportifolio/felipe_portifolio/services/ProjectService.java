package com.felipeportifolio.felipe_portifolio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeportifolio.felipe_portifolio.entities.Project;
import com.felipeportifolio.felipe_portifolio.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository repository;
	
	public List<Project> findAll() {
		return repository.findAll();
	}
	
	public Project findById(Long id) {
		Optional<Project> obj = repository.findById(id);
		return obj.get();
	}

}
