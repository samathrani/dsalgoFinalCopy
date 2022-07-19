package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.GraphPC;


public class Graph {
	
	WebDriver driver = Hooks.driver;
	GraphPC graphpage;

	@Given("The user is signed in to the graph with input from data sheet under {string} and {string}")
	public void the_user_is_signed_in_to_the_graph_with_input_from_data_sheet_under_and(String testId, String sheetName) {
		graphpage = new GraphPC(driver);
		graphpage.clickhomeGetStarted();
		graphpage.clicksignIn();
		graphpage.enterusername(testId, sheetName);
		graphpage.enterpassword(testId, sheetName);
		graphpage.clicklogin();
		graphpage.clickgraphGS();
	}

	@When("The user clicks graph page")
	public void the_user_clicks_graph_page() {
		graphpage.clickGraph();
	}

	@When("The user clicks Try Here button in graph page")
	public void the_user_clicks_try_here_button_in_graph_page() {
		graphpage.clicktryhere();
	}

	@When("The User enters pyton code and run it in graph page")
	public void the_user_enters_pyton_code_and_run_it_in_graph_page() {
		graphpage.clickenterText();
		graphpage.run();
	}

	@Then("The user should get print statement for graph page")
	public void the_user_should_get_print_statement_for_graph_page() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}

	@When("The user clicks Graph Representations button")
	public void the_user_clicks_graph_representations_button() {
		graphpage.clickrepresntationG();
	}

	@When("The user clicks Try Here button in Graph Representations page")
	public void the_user_clicks_try_here_button_in_graph_representations_page() {
		graphpage.clicktryhere();
	}

	@When("The User enters pyton code and run it in Graph Representations")
	public void the_user_enters_pyton_code_and_run_it_in_graph_representations() {
		graphpage.clickenterText();
		graphpage.run();
	}

	@Then("The user should get print statement for Graph Representations")
	public void the_user_should_get_print_statement_for_graph_representations() {
 System.out.println("------"+"hello world"+"----------");
		 
		 driver.navigate().back();
	}


}
