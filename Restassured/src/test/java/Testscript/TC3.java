package Testscript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import Responsevalidation.Responsevalidation;
import TestStep.HTTPMethod;
import TestUtilities.Propertyclass;

public class TC3 
{
	
	
	@Test
	public void testcase3() throws IOException
	{
		
		JSONObject data= new JSONObject();
		data.put("firstname", "updated firstname");
		data.put("lastname", "updated lastname");
		data.put("id", TC1.idValue);
		data.put("age", "16");
		
		
		
		
		
		
	Properties pr=	Propertyclass.propertiesmethod("../Restassured/Env.properties");
    HTTPMethod http = new HTTPMethod(pr);
	
		
	Response res =	http.putrequest("QA_URI", TC1.idValue, data.toString());
	Responsevalidation.responsestatuscodevalidate(200, res);
	System.out.println("second testcase" + res.asString());
	System.out.println("status code"  + res.statusCode());
	

		
	}

}
