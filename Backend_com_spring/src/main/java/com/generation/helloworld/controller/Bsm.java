package com.generation.helloworld.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bsm")
public class Bsm {

	private ArrayList<String> BsmList = new ArrayList<>();
	
	@GetMapping
	public ArrayList Bsms() {
		BsmList = new ArrayList<>();
		BsmList.add("Proatividade");
		BsmList.add("Persistência");
		BsmList.add("Comunicação");
		BsmList.add("Orientação ao futuro");
		BsmList.add("Orientação aos detalhes");
		BsmList.add("Trabalho em equipe");
		BsmList.add("Mentalidade de crescimento");
		BsmList.add("Responsabilidade pessoal");
		
		return BsmList;
		
	}
	
	
}