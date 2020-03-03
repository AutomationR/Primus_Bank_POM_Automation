package com.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.automation.pages.PrimusBank_Admin;
import com.automation.pages.PrimusBank_Branches;
import com.automation.pages.PrimusBank_Home;
import com.automation.pages.PrimusBank_NewBranch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusBank_Admin_Branches_Steps {

	public WebDriver driver;

	@Given("Launch the Primus Bank Application in Browser")
	public void launch_the_Primus_Bank_Application_in_Browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");

	}

	@When("I Select {string} , {string} and {string} in Banker Login Sect")
	public void i_Select_and_in_Banker_Login_Sect(String branch, String username, String password) {

		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.bankerLogin(username, password, branch);

	}

	@And("Click on the Login Button")
	public void click_on_the_Login_Button() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickLogin();

	}

	@Then("The Admin Page must open")
	public void the_Admin_Page_must_open() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.verifyLogin();
	}

	@When("I Click on Branches")
	public void i_Click_on_Branches() {
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		pbadmin.clickBranches();

	}

	@Then("Branches Page must be opened.")
	public void branches_Page_must_be_opened() throws InterruptedException {
		Thread.sleep(2500);
		PrimusBank_Admin pbadmin = new PrimusBank_Admin(driver);
		pbadmin.verifyBranches();

	}

	@When("I Click on New Branches Button")
	public void i_Click_on_New_Branches_Button() {
		PrimusBank_Branches pbbranch = new PrimusBank_Branches(driver);
		pbbranch.clickNewBranch();

	}

	@When("Enter the {string} , {string} , {string} , {string} , {string} , {string} , and Select the {string} , {string} , {string}")
	public void enter_the_and_Select_the(String branchname, String address1, String address2, String address3,
			String area, String zipcode, String country, String state, String city) {
		PrimusBank_NewBranch pbnewbranch = new PrimusBank_NewBranch(driver);
		pbnewbranch.enterBranchDetails(branchname, address1, address2, address3, area, zipcode, country, state, city);

	}

	@When("Click on the Submit Button")
	public void click_on_the_Submit_Button() throws InterruptedException {
		PrimusBank_NewBranch pbnewbranch = new PrimusBank_NewBranch(driver);
		pbnewbranch.clickSubmit();
		Thread.sleep(2500);

	}

	@Then("The New Branch Should be Added")
	public void the_New_Branch_Should_be_Added() throws InterruptedException {
		PrimusBank_Branches pbbranch = new PrimusBank_Branches(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		pbbranch.confirmAlert();
		
		Thread.sleep(2500);
		String pagesrc = driver.getPageSource();
		Assert.assertTrue(pagesrc.contains("Tester"));
	}

}
