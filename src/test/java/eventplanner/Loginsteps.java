package eventplanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myapplication.MyApplication;

public class Loginsteps {
	MyApplication app;
	  
	 public Loginsteps( MyApplication ob) {
		 app=ob;
	 }
	@Given("Iam not in system")
	public void iamNotInSystem() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checking for error message");
	    
	}
	@When("Set username \"nao\"and pass {string}")
	public void setUsernameNaoAndPass(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checking for error message");
	}
	@Then("login succeed")
	public void loginSucceed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checking for error message");
	}



}
