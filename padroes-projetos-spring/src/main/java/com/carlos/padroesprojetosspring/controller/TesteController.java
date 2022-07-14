package com.carlos.padroesprojetosspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class TesteController {

	@GetMapping(path="/hello")
	public String hello() {
		return "Hello World";
	}
}
