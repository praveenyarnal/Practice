package getRequest;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import static io.restassured.RestAssured.*;

public class GetData {

	@Test
	public void testResponseCode(){
	/*	Response  resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code=resp.getStatusCode();
		System.out.println("The Response code is"+ code);
	Assert.assertEquals(200, code);*/
		
		/*String url="https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
	given().
	when().get(url).then().assertThat().statusCode(200);*/
	
	RestAssured.baseURI="https://samples.openweathermap.org";
	given().queryParam("q","London,uk")
	.queryParam("appid", "b6907d289e10d714a6e88b30761fae22")
	.when().
    get("/data/2.5/weather").
    	then().assertThat().statusCode(200);
	
			
	
	}
}
