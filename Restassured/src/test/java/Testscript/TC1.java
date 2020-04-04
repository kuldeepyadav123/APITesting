package Testscript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import Responsevalidation.Responsevalidation;
import TestStep.HTTPMethod;
import TestUtilities.Propertyclass;
import TestUtilities.ResponseDataParsingUsingJsonpath;

public class TC1 
{
	static String idValue;
@Test	
public void testcase1() throws IOException
{
	
	    Random no = new Random();
	    int rand = no.nextInt(1000);   
	       
		
		JSONObject data= new JSONObject();
		data.put("firstname", "kuldeep");
		data.put("lastname", "yadav");
		data.put("id", "rand.toString()");
		data.put("age", "15");
		
	    Properties pr=	Propertyclass.propertiesmethod("../Restassured/Env.properties");
		HTTPMethod http = new HTTPMethod(pr);
		Response res =  http.Postrequest("QA_URI", data.toString());
		
		System.out.println("status code is"   +res.statusCode());
		
		System.out.println("data is"   + res.asString());
		
		Responsevalidation.responsestatuscodevalidate(201, res);
		idValue = ResponseDataParsingUsingJsonpath.response_parsing(res, "id");
	
		System.out.println("id value is  "+  idValue);
		 
		
	

}}
