package TestUtilities;

import com.jayway.restassured.response.Response;

public class ResponseDataParsingUsingJsonpath
{
	
	public static String response_parsing( Response res, String jsonpath   )
	
	{
		
		
		return res.jsonPath().get(jsonpath);
	}

}
