package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class Objetivos {
	
	@GetMapping
	public String objetivos() {
		return "Objetivos de aprendizado dessa semana: Revisamos BSM's, Prototipando o Banco de Dados, Introdução ao SQL e criação de database, Associação de tabelas com Joins, Introdução e desenvolvimento web usando Java e Spring boot ";
	}


}
