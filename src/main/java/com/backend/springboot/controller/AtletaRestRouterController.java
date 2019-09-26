package com.backend.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtletaRestRouterController {
	
	@RequestMapping(value = "/atleta/createAtleta", method = RequestMethod.POST)
	public void createAtleta(String nome, int idade, String modalidade, String posicao){
		// criar atleta
	}
	
	@RequestMapping(value = "/atleta/editeAtleta", method = RequestMethod.POST)
	public void editAtleta(int idAtleta, String nome, int idade, String modalidade, String posicao){
		// editar um  atleta existente
	}
	
	@RequestMapping(value = "/atleta/getAtleta", method = RequestMethod.GET)
	public void getAtleta(){
		// recuperar um atleta
	}
	
	@RequestMapping(value = "/atleta/removeAtleta/{idAtleta}", method = RequestMethod.GET)
	public void removeAtleta(@PathVariable int idAtleta){
		// editar um  atleta existente
	}
	
	

}
