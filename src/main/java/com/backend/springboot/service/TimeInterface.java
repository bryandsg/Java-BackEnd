package com.backend.springboot.service;

import java.util.Optional;

import com.backend.springboot.model.Time;

public interface TimeInterface {
	
	Optional<Time> getTime(Integer idTime);
	
	public void deleteTodosTimes();
	public void deleteTime(Integer idTime);
	public void updateTimeById(Integer idTime, Time novoTime);
	public void updateTime(Time novoTime);
	public void insertTime(Time novoTime);

}
