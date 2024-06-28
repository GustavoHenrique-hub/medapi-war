package br.edu.senaisp.ApiTest_War.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/med")
public class MedController {
	
	
	@GetMapping("/message")
	public String message() {
		return "Deployment concluido!";
	}
}
