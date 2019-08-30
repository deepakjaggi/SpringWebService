package no.vipps.demo.impl;

import java.util.Random;

import org.springframework.stereotype.Component;

import no.vipps.demo.model.MakePayment;


@Component
public class MakePaymentImpl
{
	public MakePayment doPayment(MakePayment makePayment)
	{
		if (makePayment.getSenderMobileNumber().toString()=="")
		{
			makePayment.errorCode="9001";
			makePayment.errorMessage="sender Number can not be null";			
		}else if (makePayment.getRxerMobileNumber().toString()=="")
		{
			makePayment.errorCode="9002";
			makePayment.errorMessage="rxer Number can not be null";			
		}else if (makePayment.getAmount()=="")
		{
			makePayment.errorCode="9003";
			makePayment.errorMessage="amount can not be null";			
		}
		else
		{
			Random rand=new Random();			
			makePayment.setErrorCode("9000");
			makePayment.setErrorMessage("Success");
			makePayment.setTxnID(Integer.toString(rand.nextInt(100000000)));			
		}
		return makePayment;	
	}
	public MakePayment doPaymentMock(MakePayment makePayment)
	{
		if (makePayment.getSenderMobileNumber().toString()=="")
		{
			makePayment.errorCode="9001";
			makePayment.errorMessage="sender Number can not be null";			
		}else if (makePayment.getRxerMobileNumber().toString()=="")
		{
			makePayment.errorCode="9002";
			makePayment.errorMessage="rxer Number can not be null";			
		}else if (makePayment.getAmount()=="")
		{
			makePayment.errorCode="9003";
			makePayment.errorMessage="amount can not be null";			
		}
		else
		{
			Random rand=new Random();			
			makePayment.setErrorCode("9000");
			makePayment.setErrorMessage("Success");
			makePayment.setTxnID(Integer.toString(rand.nextInt(100000000)));			
		}
		return makePayment;	
	}
}




