package com.impls;

import com.model.AddRequest;
import com.model.AddResponse;


public class Ecomm
{
	public AddResponse add(AddRequest addRequest)
	{
		AddResponse addResponse = new AddResponse(); 
		addResponse.setResult(addRequest.getA() + addRequest.getB() + addRequest.getC());
		return addResponse;
	}

}
