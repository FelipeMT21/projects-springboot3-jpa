package com.felipeportifolio.felipe_portifolio.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeportifolio.felipe_portifolio.entities.Category;
import com.felipeportifolio.felipe_portifolio.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

	@Autowired
	CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findByid(@PathVariable Long id) {
		Category cat = service.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
