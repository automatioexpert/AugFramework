package apitesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetData {

	@Test
	public void testStatusCode()
	{
		int code=RestAssured
		.given()
		.get("https://reqres.in/api/users/2")
		.getStatusCode();
		Assert.assertEquals(code, 200);
		
	}
	
	
	@Test
	public void testContent()
	{
		String data=RestAssured
		.given()
		.get("https://reqres.in/api/users/2")
		.getBody().asString();	
		Assert.assertTrue(data.contains("Janet"));
	}
	
}
