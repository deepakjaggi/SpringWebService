package no.vipps.demo.impl;

import org.springframework.stereotype.Component;

import no.vipps.demo.model.AddRequest;
import no.vipps.demo.model.AddResponse;

@Component
public class Ecomm
{
	public AddResponse add(AddRequest addRequest)
	{
		AddResponse addResponse = new AddResponse(); 
		addResponse.setResult(addRequest.getA() + addRequest.getB() + addRequest.getC());
		return addResponse;
	}

}
