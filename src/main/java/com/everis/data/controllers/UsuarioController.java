package com.everis.data.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.data.models.Usuario;
import com.everis.data.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService=usuarioService;
	}
	
	@RequestMapping("")
	public String index(@ModelAttribute("usuario") Usuario usuario, Model model) {
		
		List<Usuario> lista_usuarios = usuarioService.findAll();
		System.out.println(lista_usuarios);
		model.addAttribute("lista",lista_usuarios);
		return "usuario.jsp";
		
	}
	
}
