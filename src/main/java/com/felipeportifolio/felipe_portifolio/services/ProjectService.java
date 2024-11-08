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
	
	public Project insert(Project obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Project update(Long id, Project obj) {
		Project entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Project entity, Project obj) {
		entity.setTitle(obj.getTitle());
		entity.setDescription(obj.getDescription());
		entity.setUrl(obj.getUrl());
	}
}
