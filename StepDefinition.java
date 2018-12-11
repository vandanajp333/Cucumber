package stepDefinitionFiles;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^check login success$")
	public void login() {
		System.out.println("Given..login");
	}
	
	@When("^app login$")
	public void appLogin() {
		System.out.println("app login");
	}
	
	@When("^app login1(.+)and (.+)$")
	public void app_login1(String arg1, String arg2) {
		System.out.println("parametsrs are "+arg1 +" "+arg2);	}



	@Then("^logout$")
	public void logout() {
		System.out.println("logout");
	}

	@Then("^dfd$")
	public void dfd() throws Throwable {
		System.out.println("then");	}
	
	@Given("^check login with un \"([^\"]*)\" and pw \"([^\"]*)\"$")
	public void check_login_with_un_and_pw(String arg1, String arg2)  {
		System.out.println(arg1+" "+arg2);
}

	
}
