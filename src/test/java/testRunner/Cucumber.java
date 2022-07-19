package testRunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber-reports/CucumberHTML.html" }, 
				
		features = {"src/test/resources/feature" }, 
		glue = { "stepDefinition" })

public class Cucumber  extends AbstractTestNGCucumberTests  {
	
	@Override
	 
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
return super.scenarios();

}}
