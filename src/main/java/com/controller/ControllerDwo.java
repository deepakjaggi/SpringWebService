package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.impls.Ecomm;
import com.model.AddRequest;
import com.model.AddResponse;

@org.springframework.stereotype.Controller
public class ControllerDwo
{
	@Autowired
	Ecomm ecomm;
	
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public ResponseEntity<String> checkhealth()
	{
		return new ResponseEntity<String>("Hello", HttpStatus.OK);	
	}
		
	@RequestMapping(value = "/business/addEcomm", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public ResponseEntity<AddResponse> addEcomm(@RequestBody AddRequest addRequest)
	{
		AddResponse response = ecomm.add(addRequest);
		return new ResponseEntity<AddResponse>(response, HttpStatus.ACCEPTED);
	}
}