package com.backend.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.springboot.model.Atleta;
import com.backend.springboot.service.AtletaService;

@RestController
public class AtletaRestRouterController {
	
	@Autowired
	private AtletaService atletaService;
	
	
	@RequestMapping(value = "/atleta/createAtleta", method = RequestMethod.POST)
	public String createAtleta(@RequestBody Atleta novoAtleta){
		atletaService.insertAtleta(novoAtleta);
		return "ATLETA CRIADO";
	}
	
	@RequestMapping(value = "/atleta/editeAtleta/{idAtleta}", method = RequestMethod.POST)
	public String editAtleta(@PathVariable("idAtleta") int idAtleta, @RequestBody Atleta novoAtleta){
		
		atletaService.updateAtletaById(idAtleta, novoAtleta);
		return "ATLETA EDITADO COM SUCESSO";
	}
	
	//recupera um atleta específico
	@RequestMapping(value = "/atleta/getAtleta{idAtleta}", method = RequestMethod.GET)
	public Optional<Atleta> getAtleta(@PathVariable int idAtleta){
		
		return atletaService.getAtletaById(idAtleta);
	}
	//recupera todos os atletas
	@RequestMapping(value = "/atleta/getTodosAtletas", method = RequestMethod.GET)
	public List<Atleta> getTodosAtletas(){
		return atletaService.getAtletas();
	}
 	
	//remove um atleta específico
	@RequestMapping(value = "/atleta/removeAtleta/{idAtleta}", method = RequestMethod.GET)
	public String removeAtleta(@PathVariable int idAtleta){
		atletaService.deleteAtleta(idAtleta);
		return "deletado: ATLETA"+idAtleta;
	}
	
	

}
