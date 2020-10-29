package com.alquiler.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {
	 @GetMapping("/")
	 
	 
	 //prueba para verificar forms
	 public String inicio() {
		 return"AdminP";
	 }
}
