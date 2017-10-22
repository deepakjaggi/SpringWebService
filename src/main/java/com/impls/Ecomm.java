package com.impls;

import org.springframework.stereotype.Component;

import com.model.AddRequest;
import com.model.AddResponse;

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
