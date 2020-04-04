package Testscript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import Responsevalidation.Responsevalidation;
import TestStep.HTTPMethod;
import TestUtilities.Propertyclass;
import TestUtilities.ResponseDataParsingUsingJsonpath;


public class TC5 {

	@Test
	public void testcase5() throws IOException
	{
	
		Properties pr=	Propertyclass.propertiesmethod("../Restassured/Env.properties");
	    HTTPMethod http = new HTTPMethod(pr);
		Response res = http.GetRequest("QA_URI", null);
			System.out.println("test cases 5 for getting all data");
			Responsevalidation.responsestatuscodevalidate(200, res);	
	
		
		System.out.println("status code"  + res.getStatusCode());
		System.out.println("second testcase" + res.asString());
		System.out.println("status code"  + res.statusCode());
		
		
		
		
		
		
		
	}

}
