package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageClasses.TreePC;

public class Tree {
	WebDriver driver = Hooks.driver;
	TreePC treepage;
	
	
	@Given("The user is in the tree page after logged in with input from data sheet under {string} and {string}")
	public void the_user_is_in_the_tree_page_after_logged_in_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		treepage = new TreePC(driver);
		treepage.clickhomeGetStarted();
		treepage.clicksignIn();
		treepage.enterusername(testId, sheetName);
		treepage.enterpassword(testId, sheetName);
		treepage.clicklogin();
		treepage.clicktreeGS();
	}

	@When("The user clicks Overview of Trees")
	public void the_user_clicks_overview_of_trees() {
		treepage.clickoverview();

	}

	@When("The user clicks Try Here button in Overview of Trees")
	public void the_user_clicks_try_here_button_in_overview_of_trees() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Overview of Trees")
	public void the_user_enters_pyton_code_and_run_it_in_overview_of_trees() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Overview of Trees")
	public void the_user_should_get_print_statement_for_overview_of_trees() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Terminologies")
	public void the_user_clicks_terminologies() {
		treepage.clickterminology();
	}

	@When("The user clicks Try Here button in Terminologies")
	public void the_user_clicks_try_here_button_in_terminologies() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Terminologies")
	public void the_user_enters_pyton_code_and_run_it_in_terminologies() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Terminologies")
	public void the_user_should_get_print_statement_for_terminologies() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Types of Trees")
	public void the_user_clicks_types_of_trees() {
		treepage.clictypesk();
	}

	@When("The user clicks Try Here button in Types of Trees")
	public void the_user_clicks_try_here_button_in_types_of_trees() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Types of Trees")
	public void the_user_enters_pyton_code_and_run_it_in_types_of_trees() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Types of Trees")
	public void the_user_should_get_print_statement_for_types_of_trees() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks operations in Tree Traversals")
	public void the_user_clicks_operations_in_tree_traversals() {
		treepage.clicktraversals();
	}

	@When("The user clicks Try Here button in Tree Traversals")
	public void the_user_clicks_try_here_button_in_tree_traversals() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Tree Traversals")
	public void the_user_enters_pyton_code_and_run_it_in_tree_traversals() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Tree Traversals")
	public void the_user_should_get_print_statement_for_tree_traversals() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Binary Trees")
	public void the_user_clicks_binary_trees() {
		treepage.clickbinary();
	}

	@When("The user clicks Try Here button in Binary Trees")
	public void the_user_clicks_try_here_button_in_binary_trees() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Binary Trees")
	public void the_user_enters_pyton_code_and_run_it_in_binary_trees() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Binary Trees")
	public void the_user_should_get_print_statement_for_binary_trees() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Implementation in Python")
	public void the_user_clicks_implementation_in_python() {
		treepage.clickimplementation();
	}

	@When("The user clicks Try Here button in Implementation in Python")
	public void the_user_clicks_try_here_button_in_implementation_in_python() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Implementation in Python")
	public void the_user_enters_pyton_code_and_run_it_in_implementation_in_python() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Implementation in Python")
	public void the_user_should_get_print_statement_for_implementation_in_python() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks operations in Applications of Binary trees")
	public void the_user_clicks_operations_in_applications_of_binary_trees() {
		treepage.clickapplication();
	}

	@When("The user clicks Try Here button in Applications of Binary trees")
	public void the_user_clicks_try_here_button_in_applications_of_binary_trees() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Applications of Binary trees")
	public void the_user_enters_pyton_code_and_run_it_in_applications_of_binary_trees() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Applications of Binary trees")
	public void the_user_should_get_print_statement_for_applications_of_binary_trees() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Implementation Of BST")
	public void the_user_clicks_implementation_of_bst() {
		treepage.clickimplementation();
	}

	@When("The user clicks Try Here button in Implementation Of BST")
	public void the_user_clicks_try_here_button_in_implementation_of_bst() {
		treepage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Implementation Of BST")
	public void the_user_enters_pyton_code_and_run_it_in_implementation_of_bst() {
		treepage.clickenterText();
		treepage.run();
	}

	@Then("The user should get print statement for Implementation Of BST")
	public void the_user_should_get_print_statement_for_implementation_of_bst() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

}
