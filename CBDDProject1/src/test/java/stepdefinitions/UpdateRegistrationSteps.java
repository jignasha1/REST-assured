package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateRegistrationSteps {
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("user navigates on registration page");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	  List<List<String>> userList = dataTable.asLists(String.class);//return list of lists
	  for(List<String> e: userList)
	  {
		  System.out.println(e);
	  }
	}
	
	@When("user enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) {
	    List<Map<String, String>> userMap = dataTable.asMaps(String.class,String.class);//return list of maps
	}

	@Then("user registration should be successfull")
	public void user_registration_should_be_successfull() {
	    
	}



}
