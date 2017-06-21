package test.java.rest;

import static org.testng.Assert.assertTrue;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class MyRest {

	@Test

	public void TC1() {

		JSONObject jsonObj = new JSONObject();

		jsonObj.put("email", "sydney@gmail");
		jsonObj.put("password", "abcde");

		given().contentType("application/json").body(jsonObj.toString()).when().post("https://reqres.in/api/login")
				.then().statusCode(200);

	}
	
	@Test
	
	public void TC2(){
		
		Response resp = given().contentType("application/json").when().get("https://reqres.in/api/users/2")
		.then().extract().response();
		System.out.println(resp.jsonPath().get("data.first_name"));
		String name = resp.jsonPath().get("data.first_name");
		assertTrue(name.equals("lucille"));
	}

}
