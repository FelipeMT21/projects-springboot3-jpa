package com.felipeportifolio.felipe_portifolio.resources;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeportifolio.felipe_portifolio.entities.Projects;

@RestController
@RequestMapping(value = "/projects")
public class ProjectsResources {

	@GetMapping
	public ResponseEntity<Projects> findAll() {
		Projects p = new Projects(1l, "Weather Project", "TEST TO SE THIS IT WORK", "testestestetstes", LocalDate.now());
		return ResponseEntity.ok().body(p);
	}
}
