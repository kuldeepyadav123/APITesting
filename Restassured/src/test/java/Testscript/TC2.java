package Testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import Responsevalidation.Responsevalidation;
import TestStep.HTTPMethod;
import TestUtilities.Propertyclass;

public class TC2

{
	@Test
	
	public void testcase2() throws IOException
	{
		Properties pr=	Propertyclass.propertiesmethod("../Restassured/Env.properties");
		
		HTTPMethod http = new HTTPMethod(pr);
	
		
	Response res =	http.GetRequest("QA_URI", TC1.idValue);
	System.out.println("second testcase" + res.asString());
	System.out.println("status code"  + res.statusCode());
	
	Responsevalidation.responsestatuscodevalidate(200, res);
	}

}
