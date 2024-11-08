package com.felipeportifolio.felipe_portifolio.resources;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeportifolio.felipe_portifolio.entities.Project;
import com.felipeportifolio.felipe_portifolio.services.ProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectResources {

	@Autowired
	ProjectService service;
	
	@GetMapping
	public ResponseEntity<List<Project>> findAll() {
		List<Project> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Project> findById(@PathVariable Long id) {
		Project p = service.findById(id);
		return ResponseEntity.ok().body(p);
	}
}
