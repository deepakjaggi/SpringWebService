package sitTestCases.healthCheck;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jayway.restassured.response.Response;

import common.CommonTestMethods;
import junit.framework.Assert;


public class HealthCheck {

	@Test
	public void test() 
	{
		CommonTestMethods commonTestMethods =  new CommonTestMethods();
		Response response = commonTestMethods.executeGetService("http://localhost:8080/demo-0.1/health");
		Assert.assertEquals("HelloManisha",response.prettyPrint().toString());
	}

}
