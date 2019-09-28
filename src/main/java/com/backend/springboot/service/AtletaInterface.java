package com.backend.springboot.service;

import java.util.Optional;

import com.backend.springboot.model.Atleta;

public interface AtletaInterface {

	Optional<Atleta> getAtletaById(Integer id);
	
	public void deleteAtleta(Integer id);
	public void deleteTodosAtletas();
	public void updateAtletaById(Integer id, Atleta novoAtleta);
	public void updateAtleta(Atleta novoAtleta);
	public void insertAtleta(Atleta novoAtleta);
	
}
