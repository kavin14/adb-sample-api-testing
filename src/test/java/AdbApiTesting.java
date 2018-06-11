import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AdbApiTesting {
	@Test
	public void hello() {
		baseURI = "http://localhost:8080/";
		Response response =  given().get("/hello");
		assertEquals("Hello World", response.getBody().asString());	
	}
	
	@Test
	public void helloWithId() {
		baseURI = "http://localhost:8080/";
		Response response =  given().get("/hello/kavin");
		assertEquals("Hello  kavin", response.getBody().asString());	
	}
}
