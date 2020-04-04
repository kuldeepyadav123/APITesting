package TestStep;	
	import java.util.Properties;

	import com.jayway.restassured.http.ContentType;
	import com.jayway.restassured.response.Response;
	import static com.jayway.restassured.RestAssured.given;

public class HTTPMethod
{
		
		Properties pr;
		
		
		public  HTTPMethod(Properties pr)
		{
			this.pr = pr;
		}
		
		public Response GetRequest( String urikey , String idValue)

		{
			 String uri = pr.getProperty(urikey) + "/" +idValue;
			Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(uri);
			return res;
			
			
			
			
		
		}
		
		
	
		
	public Response Postrequest(String urikey , String body )

	{	Response res=
			given()
			 .contentType(ContentType.JSON)
			.body(body)
			.when()
			.post(pr.getProperty(urikey));
			return res;

	}
	
	
	public Response putrequest (String urikey , String idValue, String body)

	{
		 String uri = pr.getProperty(urikey) + "/" +idValue;
			Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.put(uri);
			return res;
			
			
		
	}
	
	public Response deleterequest (String urikey, String idValue)
	{
		
		 String uri = pr.getProperty(urikey) + "/" +idValue;
		Response res=
				given()
				 .contentType(ContentType.JSON)
		
				.when()
				.delete(uri);
				return res;

		
		
	}

	
	
	public Response postemployeeinfo (String urikey, String body)
	{
		
		// String uri = pr.getProperty(urikey) + "/" +idValue;
		Response res=
				given()
				 .contentType(ContentType.JSON)
		.body(body)
				.when()
				.post(pr.getProperty(urikey));
				return res;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}}
