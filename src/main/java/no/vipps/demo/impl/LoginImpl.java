package no.vipps.demo.impl;

import java.util.Random;

import org.springframework.stereotype.Component;

import no.vipps.demo.model.Login;
@Component
public class LoginImpl
{
	public Login getToken(Login login)
	{
		if (login.getMobileNumber() != "")
		{
			if (login.getPin() != "")
			{
				Random rand=new Random();
				login.setToken(Integer.toString(rand.nextInt(1000000)));
				login.setErrorCode("9000");
				login.setErrorMessage("Success");
			}
			else
			{
				login.setErrorCode("9001");
				login.setErrorMessage("Pin not valid");
			}
		}
		else
		{
			login.setErrorCode("9002");
			login.setErrorMessage("mobile Number not valid");
		}			
		return login;
	}
}
