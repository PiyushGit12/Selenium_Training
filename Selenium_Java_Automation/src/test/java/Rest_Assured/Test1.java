package Rest_Assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.*;


public class Test1 {

	@Test
	public void get() {
		
	Response r1=RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(r1.statusCode());

	}
	
}
