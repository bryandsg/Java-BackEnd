package com.backend.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeRestRouterController {
	@RequestMapping(value = "/time/createTime", method = RequestMethod.POST)
	public void createAtleta(){
		// criar 
	}
	
	@RequestMapping(value = "/time/editeTime", method = RequestMethod.POST)
	public void editAtleta(){
		// editar 
	}
	
	@RequestMapping(value = "/time/getTime", method = RequestMethod.GET)
	public void getTime(){
		// recuperar 
	}
	
	@RequestMapping(value = "/time/removeTime/{idAtleta}", method = RequestMethod.GET)
	public void removeTime(@PathVariable int idTime){
		// editar 
	}
}
