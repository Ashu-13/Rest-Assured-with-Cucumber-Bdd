package stepDefFiles;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import junit.framework.Assert;
import resourcePack.Resources;

import static io.restassured.RestAssured.*;


public class StepDef{
	
	Response response= null ;
		
	@When("^user gets the response$")
	public void UserResponse(){
		
		response = given().get(Resources.api);
		
		System.out.println("The response is" +response);
		
	}
	
	@Then("^the response should be of json type$")
	public void ResponseType(){
		String type = response.header("Content-Type");
		System.out.println("The response type is " +type);
	

	}
   @And("^Status code should be valid$")
   public void StatusCodeValidation(){
	   
     int code = response.statusCode();
	   System.out.println("The response code of the status is" +code);
   
   }
	
	
//   public void Test1(){
//	   
//	   given().
//	   when().
//	   get("http://ergast.com/api/f1/2017/circuits.json").
//	   then().
//	   assertThat().statusCode(200);
//   
//   }
}
