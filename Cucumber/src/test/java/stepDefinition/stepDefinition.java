package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Given("user is on Netbanking landing page")
	public void user_is_on_Netbanking_landing_page() {
		System.out.println("login url");
	}
	
	@When("user login into application with username and password")
	public void  user_login_into_application_with_username_and_password() {
		System.out.println("user login");
	}
	
	@Then("Home page is populated")
	public void Home_page_is_populated() {
		System.out.println("Home page");
	}

	 @And("cards are displaued")
	 public void  cards_are_displaued() {
		 System.out.println("cards are displayed");
	 }
}
