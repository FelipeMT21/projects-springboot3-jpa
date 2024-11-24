package com.felipeportifolio.felipe_portifolio.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipeportifolio.felipe_portifolio.entities.Project;
import com.felipeportifolio.felipe_portifolio.repositories.ProjectRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Project p1 = new Project(null, "Keeper",
				"Neste projeto, criei um aplicativo chamado Keeper que permite ao usuário adicionar e apagar notas. O objetivo deste desafio foi aprimorar meus conhecimentos em React, JavaScript, manipulação do DOM e Node.js. O código-fonte está disponível no meu repositório do GitHub: ", 
				"https://keeper-note-xi.vercel.app/",
				"https://felipe-developer.vercel.app/_next/image?url=%2F_next%2Fstatic%2Fmedia%2FKeeper.e8c3ce59.jpeg&w=1920&q=75",
				"https://github.com/FelipeMT21/keeper-note",
				LocalDate.now());
		
		Project p2 = new Project(null, "Drum Kit",
				"Desafio proposto no curso The Complete 2023 Web Development Bootcamp. Neste projeto, criei uma bateria virtual que toca sons de instrumentos quando clicada com o mouse ou quando as teclas corretas são pressionadas. O objetivo deste desafio foi aprimorar meus conhecimentos em JavaScript, funções e manipulação do DOM para atualização da página. O código-fonte está disponível no meu repositório do GitHub: ", 
				"https://felipemt21.github.io/drum-kit/",
				"https://felipe-developer.vercel.app/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fdrum-kit.61881ea5.jpeg&w=1920&q=75",
				"https://github.com/FelipeMT21/drum-kit",
				LocalDate.now());
		
		// projectRepository.saveAll(Arrays.asList(p1, p2));
	}
}
