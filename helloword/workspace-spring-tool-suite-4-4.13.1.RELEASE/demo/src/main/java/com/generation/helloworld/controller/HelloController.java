package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

		@GetMapping
		public String getHello () {
			return "Habilidades e mentalidades usadas: Adaptabilidade, Orientação ao futuro "
					+ " e Persistência";
		}
		
		@GetMapping("/semana")
		public String getHello2 () {
			return "desenvolver melhor o spring e banco de dados";
		}
}

