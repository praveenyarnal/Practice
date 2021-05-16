package mukesh.authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAth2 {

	@Test
	public void test1()
	{
		/*//Response object is used to store the Response from Rest assured request.
		Response resp=  RestAssured.given().auth().oauth2("3007fc60ed120eda70124c2bc52183376c00a620")
				.when().post("http://coop.apps.symfonycasts.com/api/1859/toiletseat-down");
		System.out.println("Code "+resp.getStatusCode());
		
		System.out.println("Body \n"+ resp.getBody().asString());*/
		
		
		// Generating access token
		
		//in ordered to get Access token we need to pass the below info Notice hte URI is different from the one we are testing 
		Response resp= RestAssured.
				given()
				.formParam("client_id", "Praveen")
				.formParam("client_secret", "3727254f59fdfdaf3e53e70fef5506e1")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(resp.jsonPath().prettify());
				
		System.out.println(resp.jsonPath().get("access_token"));
		String token=resp.jsonPath().get("access_token");
		
		Response resp2=  RestAssured.given().auth().oauth2(token)
				.when().post("http://coop.apps.symfonycasts.com/api/1859/toiletseat-down");
		System.out.println("Code "+resp.getStatusCode());
		
		System.out.println("Body \n"+ resp.getBody().asString());
		
		
		//
		
	}
}
