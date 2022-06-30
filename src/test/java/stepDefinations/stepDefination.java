package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

	@Given("User is on Netbanking landing page")
	public void User_is_on_Netbanking_landing_page() {
		System.out.print("I am in landing page");
		System.out.print("I am in landing page git checking");
		System.out.print("I am in landing page git checking");
	}

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(arg1);
	   System.out.println(arg2);
	      System.out.println(arg1);
	   System.out.println(arg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("home");
		   System.out.println(arg1);
	   System.out.println(arg2);
	}
	

	@Then("^cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(arg1);
	      System.out.println(arg1);
	   System.out.println(arg2);
	}
}
