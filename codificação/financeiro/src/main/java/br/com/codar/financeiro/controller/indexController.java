package br.com.codar.financeiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String inicio() {
		return "index";
	}

}
