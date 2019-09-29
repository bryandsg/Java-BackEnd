package com.backend.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.springboot.model.Time;
import com.backend.springboot.repository.TimeRepository;

@Service("timeService")
public class TimeService implements TimeInterface{

	@Autowired
	TimeRepository timeRepository;

	@Override
	public Optional<Time> getTime(Integer idTime) {
		
		return timeRepository.findById(idTime);
	}

	@Override
	public List<Time> getTimes() {
		
		return timeRepository.findAll();
	}

	@Override
	public void deleteTodosTimes() {

		timeRepository.deleteAll();
		
	}

	@Override
	public void deleteTime(Integer idTime) {

		timeRepository.deleteById(idTime);
		
	}

	@Override
	public void updateTimeById(Integer idTime, Time novoTime) {

		Optional<Time> getTime = getTime(idTime);
		
		getTime.get().setNomeTime(novoTime.getNomeTime());
		
	}

	@Override
	public void updateTime(Time novoTime) {
		
		timeRepository.save(novoTime);
		
	}

	@Override
	public void insertTime(Time novoTime) {
		
		timeRepository.save(novoTime);
		
	}
	
	
}
