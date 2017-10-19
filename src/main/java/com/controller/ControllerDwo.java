package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.impls.Ecomm;
import com.model.AddRequest;
import com.model.AddResponse;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/business")
public class ControllerDwo
{
	Ecomm ecomm=new Ecomm();

	@RequestMapping(value = "/addEcomm", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public ResponseEntity<AddResponse> addEcomm(@RequestBody AddRequest addRequest)
	{
		AddResponse response = ecomm.add(addRequest);
		return new ResponseEntity<AddResponse>(response, HttpStatus.ACCEPTED);
	}

}
