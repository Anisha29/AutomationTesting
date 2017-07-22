package test.java.rest;

import static org.testng.Assert.assertTrue;

import org.json.JSONObject;
import org.junit.Rule;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public class MyMock {
	
	//WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089)); //No-args constructor will start on port 8080, no HTTPS
	WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(8089)); //No-args constructor will start on port 8080, no HTTPS
	

	//@Rule
	//public WireMockRule wireMockRule = new WireMockRule(8089);

	@Test

	public void setupStub() {

		wireMockServer.start();
		//stubFor(get(urlEqualTo("/my/resource")).withHeader("Accept", equalTo("text/json")).willReturn(
			//	aResponse().withStatus(200).withHeader("Content-Type", "text/json").withBody("{'result':'done'}")));

	}

	@Test
	public void TC2() {

		Response resp = given().contentType("application/json").when().get("http://localhost:8089/my/resource").then()
				.extract().response();
		System.out.println(resp.jsonPath().get("result"));
		String name = resp.jsonPath().get("result");
		assertTrue(name.equals("done"));
	}

}
