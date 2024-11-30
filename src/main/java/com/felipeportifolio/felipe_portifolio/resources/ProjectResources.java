package com.felipeportifolio.felipe_portifolio.resources;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.felipeportifolio.felipe_portifolio.entities.Project;
import com.felipeportifolio.felipe_portifolio.services.ProjectService;
import com.felipeportifolio.felipe_portifolio.services.exceptions.ResourceNotFoundException;

@CrossOrigin(origins = "https://felipedeveloper.familiaweb.com.br") //URL do Angular
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
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Project> findById(@PathVariable Long id) {
		Project p = service.findById(id);
		return ResponseEntity.ok().body(p);
	}
	
	@PostMapping
	public ResponseEntity<Project> insert(@RequestBody Project obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Project> update(@PathVariable Long id, @RequestBody Project obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}
