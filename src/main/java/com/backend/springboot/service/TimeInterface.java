package com.backend.springboot.service;

import java.util.List;
import java.util.Optional;

import com.backend.springboot.model.Time;

public interface TimeInterface {
	
	Optional<Time> getTime(Integer idTime);
	
	public List<Time> getTimes();
	public void deleteTodosTimes();
	public void deleteTime(Integer idTime);
	public void updateTimeById(Integer idTime, Time novoTime);
	public void updateTime(Time novoTime);
	public void insertTime(Time novoTime);

}
