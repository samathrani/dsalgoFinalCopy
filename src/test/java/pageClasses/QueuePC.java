package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ds_Algo.ExcelDsAlgo;
import stepDefinition.Hooks;

public class QueuePC {
	
	
	public WebDriver driver = Hooks.driver;
	ExcelDsAlgo signinexcel;
	
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/a")
	WebElement dataStructureDD;
	@FindBy(xpath = "//button[@class='btn']")
	WebElement homeGetStarted;
	@FindBy(xpath = "//div[@id='navbarCollapse']//ul/a[3]")
	WebElement signin;
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement LoggedIn;
	@FindBy(xpath = "//a[@href='queue']")
	WebElement queueGS;
	@FindBy(xpath = "//a[@href='implementation-lists']")
	WebElement Python;
	@FindBy(xpath = "//a[@href='implementation-collections']")
	WebElement collection;
	@FindBy(xpath = "//a[@href='Implementation-array']")
	WebElement array;
	@FindBy(xpath = "//a[@href='QueueOp']")
	WebElement operation;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement enterText;
	@FindBy(xpath = "//*[contains(text(),'Run')]")
	WebElement run;
	public QueuePC(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;}
	
	public void clickhomeGetStarted() {
		// driver.findElement(By.xpath("//button[@class='btn']")).click();
		homeGetStarted.click();
	}

	public void clicksignIn() {
		signin.click();

	}

	public void enterusername(String testId, String sheetName) {
		signinexcel = new ExcelDsAlgo(testId, sheetName);
		username.sendKeys(signinexcel.GetUserName());
	}

	public void enterpassword(String testId, String sheetName) {
		signinexcel = new ExcelDsAlgo(testId, sheetName);
		password.sendKeys(signinexcel.GetPassword());

	}

	public void clicklogin() {
		login.click();

	}

	public String loggedIn(String output) {

		String loggedInPage = LoggedIn.getText();
		// assertEquals(loggedInPage, "You are logged in");
		return loggedInPage;

	}

	public void clickDataStructureDD() {
		dataStructureDD.click();
	}

	public void clickqueueGS() {
		queueGS.click();

	}
	
	public void clickPython() {
		Python.click();

	}
	
	public void cliccollectionk() {
		collection.click();

	}
	
	public void clickarray() {
		array.click();

	}

	public void clickoperation() {
		operation.click();

	}
	
	public void clicktryhere() {
		tryhere.click();
	}

	public String run() {
		String tryEditorPage = run.getText();
		// assertEquals(tryEditorPage , "Run");
		return tryEditorPage;
	}

	public void clickenterText() {
		enterText.sendKeys("print('hello world')");
	}

	public void clickrun() {
		run.click();
	}
	
}
