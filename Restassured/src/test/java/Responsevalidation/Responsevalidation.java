package Responsevalidation;

import com.jayway.restassured.response.Response;

public class Responsevalidation {
	
	
	public static void responsestatuscodevalidate(int expectedstatuscode,  Response res)

	{
		if (expectedstatuscode==res.getStatusCode())
		{
		System.out.println("Test case pass with status code" + res.statusCode());
		
		
	}
		
		else
		{
			System.out.println("Testcase failed with status code" + res.statusCode());
		}
	}
		
}
