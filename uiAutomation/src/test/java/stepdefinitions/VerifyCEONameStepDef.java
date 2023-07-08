package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEONameStepDef {
	
	@Given("User logged in successfully and is on home page")
	public void user_logged_in_successfully_and_is_on_home_page() {
	System.out.println("User logged in successfully and is on home page");
	}

	@When("user clicks on the directory option from the drop down")
	public void user_clicks_on_the_directory_option_from_the_drop_down() {
		System.out.println("user clicks on the directory option from the drop down");
		}

	@When("user selects the job title as {string} from the drop down")
	public void user_selects_the_job_title_as_from_the_drop_down(String string) {
		System.out.println("user selects the job title as {string} from the drop down");
		}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		System.out.println("clicks the search button");
		}

	@Then("user should see the CEO name as {string}")
	public void user_should_see_the_ceo_name_as(String string) {
		System.out.println("user should see the CEO name as {string}");
		}
	
	

}
