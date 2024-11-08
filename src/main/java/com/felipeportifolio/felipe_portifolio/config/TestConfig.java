package com.felipeportifolio.felipe_portifolio.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipeportifolio.felipe_portifolio.entities.Category;
import com.felipeportifolio.felipe_portifolio.entities.Project;
import com.felipeportifolio.felipe_portifolio.repositories.CategoryRepository;
import com.felipeportifolio.felipe_portifolio.repositories.ProjectRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ProjectRepository projectRepository;
	
	//@Autowired
	//private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Category cat1 = new Category(null, "Data published");
//		Category cat2 = new Category(null, "Full-Stack");
//		Category cat3 = new Category(null, "FrontEnd");
//		Category cat4 = new Category(null, "BackEnd");
		
//		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
		Project p1 = new Project(null, "Weather Project", "TEST TO SE WEATHER PROJECT", "Testwhatherproject", LocalDate.now());
		Project p2 = new Project(null, "Keeper", "TEST TO SE KEEPER", "TestKeeper", LocalDate.now());
		
		projectRepository.saveAll(Arrays.asList(p1, p2));
	}
}
