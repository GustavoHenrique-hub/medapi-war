package br.edu.senaisp.ApiTest_War.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senaisp.ApiTest_War.model.Medico;

@RestController
@RequestMapping("/med")
public class MedController {
	
	
	@GetMapping("/message")
	public String message() {
		return "Deployment concluido!";
	}
	
	@GetMapping("/inserir")
	public String logins(@RequestBody Medico med) {
		return "Deployment concluido!";
	}
}
