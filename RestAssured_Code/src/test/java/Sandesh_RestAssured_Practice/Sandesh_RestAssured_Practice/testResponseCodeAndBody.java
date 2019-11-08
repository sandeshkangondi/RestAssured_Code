package Sandesh_RestAssured_Practice.Sandesh_RestAssured_Practice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class testResponseCodeAndBody {
	
	@Test
	public void setUp(){
		
	}
	
	@Test
	public void testRespAndBody(){
		/*given().
		when().
		then().
		assert()*/
		given().
		get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		assertThat().
		statusCode(200).and().
		body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
		and().
		header("Content-Length",equalTo("4551"));
	}
	
	@Test
	public void tearDown(){
		
	}

}
