package com.example.demo.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Supervisor;
import com.example.demo.repository.ISucursalRepository;
import com.example.demo.repository.ISupervisorRepository;

@Controller
public class SupervisorController {
	
	@Autowired 
	private ISucursalRepository su;
	
	@Autowired
	private ISupervisorRepository sup;
	
	@GetMapping("/listar")
	public String listadoSupervisor(Model model) {
		model.addAttribute("lstSupervisor", sup.findAll());
		return "listado";
	}
	
	@GetMapping("/")
	public String cargarPag(Model model) {
		Supervisor supervi = new Supervisor();
		model.addAttribute("supervisor", supervi);
		model.addAttribute("lstSucursal", su.findAll());
		return "crudsupervisor";
	}
	
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Supervisor supervisor, RedirectAttributes attribute) {
		if(sup.save(supervisor) != null) {
			attribute.addFlashAttribute("success", "Registrado con éxito!");
		}else {
			attribute.addFlashAttribute("unsuccess", "Error registrando!");
		}
		return "redirect:/";
	}
	
	
	@PostMapping("/actualizar")
	public String actualizarPag(@ModelAttribute Supervisor supervisor, RedirectAttributes attribute) {
		if(sup.save(supervisor) != null) {
			attribute.addFlashAttribute("success", "Actualizado con éxito!");
		}else {
			attribute.addFlashAttribute("unsuccess", "Error actualizando!");
		}
		return "redirect:/editar/"+supervisor.getCodigoS();
	}
	
	@GetMapping("/editar/{codigoS}")
	public String editar(@ModelAttribute Supervisor supervisor, Model model) {
		model.addAttribute("supervisor", sup.findByCodigoS(supervisor.getCodigoS()));
		model.addAttribute("lstSucursal", su.findAll());
		return "editar";
	}

	@GetMapping("/eliminar/{codigoS}")
	public String eliminar(@ModelAttribute Supervisor supervisor, RedirectAttributes attribute) {
		Supervisor supervi = sup.findByCodigoS(supervisor.getCodigoS());
		sup.delete(supervi);
		attribute.addFlashAttribute("success","Eliminado con éxito!");		
		return "redirect:/listar";
	}
	
	
	

}
