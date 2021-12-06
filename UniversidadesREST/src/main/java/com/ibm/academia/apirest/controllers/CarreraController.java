package com.ibm.academia.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.services.CarreraDAO;

@RestController
@RequestMapping("/carrera")
public class CarreraController
{
	@Autowired
	private CarreraDAO carreradao;
	@GetMapping("/lista/carreras")
    public List<Carrera> buscarTodas ()
    {
    	List<Carrera> carrera= (List<Carrera>)carreradao.buscarTodos();
    		
    	return carrera;
    }
}
