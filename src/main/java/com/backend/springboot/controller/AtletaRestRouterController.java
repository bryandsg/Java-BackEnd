package com.backend.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtletaRestRouterController {
	
	@RequestMapping(value = "/atleta/createAtleta", method = RequestMethod.POST)
	public String createAtleta(String nome, int idade, String modalidade, String posicao){
		// criar atleta
		return "ATLETA CRIADO";
	}
	
	@RequestMapping(value = "/atleta/editeAtleta", method = RequestMethod.POST)
	public String editAtleta(int idAtleta, String nome, int idade, String modalidade, String posicao){
		// editar um  atleta existente
		return "ATLETA EDITADO COM SUCESSO";
	}
	
	//recupera um atleta específico
	@RequestMapping(value = "/atleta/getAtleta{idAtleta}", method = RequestMethod.GET)
	public String getAtleta(@PathVariable int idAtleta){
		// recuperar um atleta
		return "ATLETA"+idAtleta;
	}
	//recupera todos os atletas
	@RequestMapping(value = "/atleta/getTodosAtletas", method = RequestMethod.GET)
	public String getTodosAtletas(){
		return "ATLETAS";
	}
 	
	//remove um atleta específico
	@RequestMapping(value = "/atleta/removeAtleta/{idAtleta}", method = RequestMethod.GET)
	public String removeAtleta(@PathVariable int idAtleta){
		// editar um  atleta existente
		return "deletado: ATLETA"+idAtleta;
	}
	
	

}
