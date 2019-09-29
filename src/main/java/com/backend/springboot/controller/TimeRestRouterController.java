package com.backend.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.springboot.model.Time;
import com.backend.springboot.service.TimeService;

@RestController
public class TimeRestRouterController {
	
	@Autowired
	TimeService timeService;
	
	@RequestMapping(value = "/time/createTime", method = RequestMethod.POST)
	public void createTime(@RequestBody Time novoTime){
		timeService.insertTime(novoTime);
	}
	
	@RequestMapping(value = "/time/editeTime/{idTime}", method = RequestMethod.POST)
	public void editTime(@PathVariable Integer idTime, @RequestBody Time novoTime){
		timeService.updateTimeById(idTime, novoTime);
	}
	
	@RequestMapping(value = "/time/getTime{idTime}", method = RequestMethod.GET)
	public Optional <Time> getTime(@PathVariable Integer idTime){
		return timeService.getTime(idTime);
	}
	
	@RequestMapping(value = "/time/getTimes", method = RequestMethod.GET)
	public List<Time> getTimes(){
		return timeService.getTimes();
	}
	
	@RequestMapping(value = "/time/removeTime/{idTime}", method = RequestMethod.GET)
	public void removeTime(@PathVariable int idTime){
		timeService.deleteTime(idTime);
	}
}
