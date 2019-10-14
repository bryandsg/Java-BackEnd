package com.backend.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Atleta {
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer idAtleta;
	 
	 @ManyToOne
	 @JoinColumn(name = "time_id", nullable = false)
	 private Time time;
	 
	 private String nome;
	 private Integer idade;
	 private String modalidade;
	 private String posicao;
	 
	 
	 
	public Time getTime() {
		return time;
	}
	
	public Integer getIdAtleta() {
			return idAtleta; 
	} 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
}
