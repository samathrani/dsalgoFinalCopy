package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.QueuePC;

public class Queue {
	WebDriver driver = Hooks.driver;
	QueuePC queuepage;
	
	@Given("The user is in the queue page after logged in with input from data sheet under {string} and {string}")
	public void the_user_is_in_the_queue_page_after_logged_in_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		queuepage = new QueuePC(driver);
		queuepage.clickhomeGetStarted();
		queuepage.clicksignIn();
		queuepage.enterusername(testId, sheetName);
		queuepage.enterpassword(testId, sheetName);
		queuepage.clicklogin();
		queuepage.clickqueueGS();
	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {
		queuepage.clickPython();
	}

	@When("The user clicks Try Here button in Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {
		queuepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Implementation of Queue in Python")
	public void the_user_enters_pyton_code_and_run_it_in_implementation_of_queue_in_python() {
		queuepage.clickenterText();
		queuepage.run();
	}

	@Then("The user should get print statement for Implementation of Queue in Python")
	public void the_user_should_get_print_statement_for_implementation_of_queue_in_python() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Implementation using collections")
	public void the_user_clicks_implementation_using_collections() {
		queuepage.cliccollectionk();
	  
	}

	@When("The user clicks Try Here button in Implementation using collections page")
	public void the_user_clicks_try_here_button_in_implementation_using_collections_page() {
		queuepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Implementation using collections")
	public void the_user_enters_pyton_code_and_run_it_in_implementation_using_collections() {
		queuepage.clickenterText();
		queuepage.run();
	}

	@Then("The user should get print statement for Implementation using collections")
	public void the_user_should_get_print_statement_for_implementation_using_collections() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Implementation using array")
	public void the_user_clicks_implementation_using_array() {
		queuepage.clickarray();
	}

	@When("The user clicks Try Here button in Implementation using array page")
	public void the_user_clicks_try_here_button_in_implementation_using_array_page() {
		queuepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Implementation using array")
	public void the_user_enters_pyton_code_and_run_it_in_implementation_using_array() {
		queuepage.clickenterText();
		queuepage.run();
	}

	@Then("The user should get print statement for Implementation using array")
	public void the_user_should_get_print_statement_for_implementation_using_array() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Queue Operations")
	public void the_user_clicks_queue_operations() {
		queuepage.clickoperation();
	}

	@When("The user clicks Try Here button in Queue Operations page")
	public void the_user_clicks_try_here_button_in_queue_operations_page() {
		queuepage.clicktryhere();
		
	}

	@When("The User enters pyton code and run it in Queue Operations")
	public void the_user_enters_pyton_code_and_run_it_in_queue_operations() {
		queuepage.clickenterText();
		queuepage.run();
	}

	@Then("The user should get print statement for Queue Operations")
	public void the_user_should_get_print_statement_for_queue_operations() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

}
