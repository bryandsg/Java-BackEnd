package com.backend.springboot.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTime;
	private String nomeTime;
	
	@OneToMany(mappedBy = "time")
	private Set<Atleta> listaAtletas;
	
	public Integer getIdTime() {
		return idTime;
	}
	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public Set<Atleta> getListaAtletas() {
		return listaAtletas;
	}
	 public void addAtleta(Atleta atletaP){
		 this.listaAtletas.add(atletaP);
	 }
}
