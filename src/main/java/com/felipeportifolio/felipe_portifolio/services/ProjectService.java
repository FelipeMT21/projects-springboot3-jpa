package com.felipeportifolio.felipe_portifolio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.felipeportifolio.felipe_portifolio.entities.Project;
import com.felipeportifolio.felipe_portifolio.repositories.ProjectRepository;
import com.felipeportifolio.felipe_portifolio.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository repository;

	public List<Project> findAll() {
		return repository.findAll();
	}

	public Project findById(Long id) {
		Optional<Project> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Project insert(Project obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		if(!repository.existsById(id)) {
			throw new ResourceNotFoundException(id);
		}
		repository.deleteById(id);
	}

	public Project update(Long id, Project obj) {
		try {			
			Project entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(Project entity, Project obj) {
	    if (obj.getTitle() != null) entity.setTitle(obj.getTitle());
	    if (obj.getDescription() != null) entity.setDescription(obj.getDescription());
	    if (obj.getUrl() != null) entity.setUrl(obj.getUrl());
	}
}
