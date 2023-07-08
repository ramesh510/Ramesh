package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPendingTimesheetStepDef {
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	System.out.println("User is on home page");
	}

	@When("user clicks on the time option from the menu")
	public void user_clicks_on_the_time_option_from_the_menu() {
		System.out.println("user clicks on the time option from the menu");
		}

	@When("user enters the name {string}")
	public void user_enters_the_name(String string) {
		System.out.println("user enters the name {string}");
		}

	@When("clicks on the view button")
	public void clicks_on_the_view_button() {
		System.out.println("clicks on the view button");
		}

	@Then("user should see the message as {string}")
	public void user_should_see_the_message_as(String string) {
		System.out.println("user should see the message as {string}");
		}



}
