package TestUtilities;
import org.json.JSONObject;
import org.json.XML;


public class xmltojson 
{

	public static String xmltoJson(String xml)
	{
	
	JSONObject responsemessage = XML.toJSONObject(xml);
	
return responsemessage.toString();
		
		
	}
	
	
	public static String xmltojsonarray(String xml)
	{
		return xml;
		
		
		
		
	}

}
