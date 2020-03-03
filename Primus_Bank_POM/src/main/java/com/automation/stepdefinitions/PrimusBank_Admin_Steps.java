package com.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.automation.pages.PrimusBank_Admin;
import com.automation.pages.PrimusBank_Home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusBank_Admin_Steps {

	public WebDriver driver;

	// Background

	@Given("Launch the Primus Bank Application in Chrome")
	public void launch_the_Primus_Bank_Application_in_Chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
	}

	@When("I Select {string} , {string} and {string} in Banker Login Section")
	public void i_Select_and_in_Banker_Login_Section(String branch, String username, String password) {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.bankerLogin(username, password, branch);
	}

	@And("Click on Login")
	public void click_on_Login() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickLogin();

	}

	@Then("The Admin Page must be Opened")
	public void the_Admin_Page_must_be_Opened() throws InterruptedException {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		Thread.sleep(3000);
		pbhome.verifyLogin();
	}

	// Navigate - Branches Page

	@When("I Click on Branches Button")
	public void i_Click_on_Branches_Button() {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		pbadmin.clickBranches();

	}

	@Then("Branches Page should be opened.")
	public void branches_Page_should_be_opened() throws InterruptedException {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		Thread.sleep(2500);
		pbadmin.verifyBranches();

	}

	// Navigate - Roles Page

	@When("I Click on Roles Button")
	public void i_Click_on_Roles_Button() {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		pbadmin.clickRoles();

	}

	@Then("Roles Page should be opened.")
	public void roles_Page_should_be_opened() throws InterruptedException {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		Thread.sleep(2500);
		pbadmin.verifyRoles();
	}

	// Navigate - Users Page

	@When("I Click on Users Button")
	public void i_Click_on_Users_Button() {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		pbadmin.clickUsers();

	}

	@Then("Users Page should be opened.")
	public void users_Page_should_be_opened() throws InterruptedException {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		Thread.sleep(2500);
		pbadmin.verifyUsers();
	}

	// Navigate - Employees Page

	@When("I Click on Employees Button")
	public void i_Click_on_Employees_Button() {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		pbadmin.clickEmployee();
	}

	@Then("Employees Page should be opened.")
	public void employees_Page_should_be_opened() throws InterruptedException {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		Thread.sleep(2500);
		pbadmin.verifyEmployee();
	}

	// Close the Browser

	@Then("Close The Primus Bank Application")
	public void close_the_primus_bank_application() {
		driver.quit();
	}
}
