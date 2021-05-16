package mukesh.authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AuthTypes {

	@Test
	public void test1(){
		int code=RestAssured.given()
				.auth().preemptive()
				.basic("ToolsQA", "TestPassword")
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
				.getStatusCode();
	System.out.println("The Response code from the server is "+ code);
	}
}
