package com.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.automation.pages.PrimusBank_Home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusBank_Home_Steps {

	public WebDriver driver;

	// Background

	@Given("Launch the Primus Bank Application")
	public void launch_the_Primus_Bank_Application() throws InterruptedException {

		Thread.sleep(2500);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");

	}

	// Navigate - Personal Banking

	@When("I Click on Personal Banking Menu Option")
	public void i_Click_on_Personal_Banking_Menu_Option() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickPersonalBanking();

	}

	@Then("The Personal Banking Page should be opened")
	public void the_Personal_Banking_Page_should_be_opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyPersonalBanking();

	}

	// Navigate - Corporate Banking

	@When("I Click on Corporate Banking Menu Option")
	public void i_Click_on_Corporate_Banking_Menu_Option() throws InterruptedException {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickCorporateBanking();

	}

	@Then("The Corporate Banking Page should be opened")
	public void the_Corporate_Banking_Page_should_be_opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyCorporateBanking();

	}

	// Navigate - International Banking

	@When("I Click on International Banking Menu Option")
	public void i_Click_on_International_Banking_Menu_Option() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickInternationalBanking();
	}

	@Then("The International Banking Page should be opened")
	public void the_International_Banking_Page_should_be_opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyInternationalBanking();
	}

	// Navigate - About Us

	@When("I Click on About Us Menu Option")
	public void i_Click_on_About_Us_Menu_Option() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickAboutUs();
	}

	@Then("The About Us Page should be opened")
	public void the_About_Us_Page_should_be_opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyAboutUs();

	}

	// Navigate - Personal Login

	@When("I Click on Personal Button in Customer Login Section")
	public void i_Click_on_Personal_Button_in_Customer_Login_Section() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickPersonal();

	}

	@Then("Personal Login Page Should Be Opened")
	public void personal_Login_Page_Should_Be_Opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyPersonal();

	}

	// Navigate - Corporate Login

	@When("I Click on Corporate Button in Customer Login Section")
	public void i_Click_on_Corporate_Button_in_Customer_Login_Section() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickCorporate();

	}

	@Then("Corporate Login Page Should Be Opened")
	public void corporate_Login_Page_Should_Be_Opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyCorporate();

	}

	// Navigate - International Login

	@When("I Click on International Button in Customer Login Section")
	public void i_Click_on_International_Button_in_Customer_Login_Section() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickInternational();
	}

	@Then("International Login Page Should Be Opened")
	public void international_Login_Page_Should_Be_Opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyInternational();

	}

	// Banker Login Scenario Steps

	@When("I Select {string} , {string} and {string} in Banker Login Details")
	public void i_Select_and_in_Banker_Login_Details(String branch, String username, String password) {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.bankerLogin(username, password, branch);

	}

	@And("Click on Login Button")
	public void click_on_Login_Button() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickLogin();

	}

	@Then("The Admin Page should be Opened")
	public void the_Admin_Page_should_be_Opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyLogin();
	}

	@Then("Close the Application")
	public void close_the_Application() {
		driver.quit();
	}

}
