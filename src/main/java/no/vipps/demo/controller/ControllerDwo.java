package no.vipps.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import no.vipps.demo.impl.LoginImpl;
import no.vipps.demo.impl.MakePaymentImpl;
import no.vipps.demo.model.Login;
import no.vipps.demo.model.MakePayment;

@org.springframework.stereotype.Controller
public class ControllerDwo
{
	@Autowired
	LoginImpl loginImpl;
	
	@Autowired
	MakePaymentImpl makePaymentImpl;
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public ResponseEntity<String> checkhealth()
	{
		return new ResponseEntity<String>("Hello", HttpStatus.OK);	
	}	
	@RequestMapping(value = "/business/login", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public ResponseEntity<Login> getToken(@RequestBody Login login)
	{
		return new ResponseEntity<Login>(loginImpl.getToken(login), HttpStatus.ACCEPTED);		
	}
	
	@RequestMapping(value = "/business/makePayment", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public ResponseEntity<MakePayment> makePayment(@RequestBody MakePayment makePayment)
	{
		return new ResponseEntity<MakePayment>(makePaymentImpl.doPayment(makePayment), HttpStatus.ACCEPTED);
				
	}
}