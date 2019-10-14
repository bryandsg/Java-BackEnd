package com.backend.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.springboot.model.Atleta;
import com.backend.springboot.repository.AtletaRepository;

@Service("atletaService")
public class AtletaService implements AtletaInterface {

	@Autowired
	AtletaRepository atletaRepository;
	
	@Override
	public Optional<Atleta> getAtletaById(Integer id) {
		
		return atletaRepository.findById(id);
	}

	@Override
	public void deleteAtleta(Integer id) {
		
		atletaRepository.deleteById(id);
		
	}

	@Override
	public void deleteTodosAtletas() {
		
		atletaRepository.deleteAll();
		
	}

	@Override
	public void updateAtletaById(Integer id, Atleta novoAtleta) {
		
		Optional<Atleta> getAtleta = getAtletaById(id);
		
		getAtleta.get().setNome(novoAtleta.getNome());
		getAtleta.get().setPosicao(novoAtleta.getPosicao());
		getAtleta.get().setModalidade(novoAtleta.getModalidade());
		getAtleta.get().setIdade(novoAtleta.getIdade());
		atletaRepository.save(getAtleta.get());
	}

	@Override
	public void updateAtleta(Atleta novoAtleta) {
		
		atletaRepository.save(novoAtleta);
		
	}

	@Override
	public void insertAtleta(Atleta novoAtleta) {

		atletaRepository.save(novoAtleta);
		
	}

	@Override
	public List<Atleta> getAtletas() {

		return atletaRepository.findAll();
	}

	

}
