package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ds_Algo.ExcelDsAlgo;
import stepDefinition.Hooks;

public class TreePC {
	
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
	@FindBy(xpath = "//a[@href='tree']")
	WebElement treeGS;
	@FindBy(xpath = "//a[@href='overview-of-trees']")
	WebElement overview;
	@FindBy(xpath = "//a[@href='terminologies']")
	WebElement terminology;
	@FindBy(xpath = "//a[@href='types-of-trees']")
	WebElement types;
	@FindBy(xpath = "//a[@href='tree-traversals']")
	WebElement traversals;
	@FindBy(xpath = "//a[@href='binary-trees']")
	WebElement Binary;
	@FindBy(xpath = "//a[@href='implementation-in-python']")
	WebElement python;
	@FindBy(xpath = "//a[@href='applications-of-binary-trees']")
	WebElement application;
	@FindBy(xpath = "//a[@href='implementation-of-bst']")
	WebElement implementation;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement enterText;
	@FindBy(xpath = "//*[contains(text(),'Run')]")
	WebElement run;
	
	public TreePC(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

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

	public void clicktreeGS() {
		treeGS.click();

	}

	public void clickoverview() {
		overview.click();

	}
	public void clickterminology() {
		terminology.click();

	}
	public void clictypesk() {
		types.click();

	}
	public void clicktraversals() {
		traversals.click();

	}
	public void clickbinary() {
		Binary.click();

	}
	public void clickpython() {
		python.click();

	}
	public void clickapplication() {
		application.click();

	}
	public void clickimplementation() {
		implementation.click();

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
