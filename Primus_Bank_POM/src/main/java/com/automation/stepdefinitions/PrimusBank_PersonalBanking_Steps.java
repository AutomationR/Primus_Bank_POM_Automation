package com.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.automation.pages.PrimusBank_Home;
import com.automation.pages.PrimusBank_PersonalBanking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusBank_PersonalBanking_Steps {

	public WebDriver driver; 

	// Background

	@Given("Launch the Primus Bank Browser Application")
	public void launch_the_Primus_Bank_Browser_Application() throws InterruptedException {

		Thread.sleep(2500);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");

	}

	@When("I Click on Personal Banking in Menu Option")
	public void i_Click_on_Personal_Banking_in_Menu_Option() {
		PrimusBank_Home pbhome = new PrimusBank_Home(driver);
		pbhome.clickPersonalBanking();
	}

	@Then("The Personal Banking Page must be opened")
	public void the_Personal_Banking_Page_must_be_opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/personal_banking.html";
		Thread.sleep(3000);
		Assert.assertEquals(actual, expected);

	}

	// To Close the Browser

	@Then("Close the Browser Application")
	public void close_the_Browser_Application() {
		driver.quit();
	}

	// Navigate - Savings Account Page

	@When("I Click on Savings Account Button")
	public void i_Click_on_Savings_Account_Button() {
		PrimusBank_PersonalBanking pbpersonalbanking = new PrimusBank_PersonalBanking(driver);
		pbpersonalbanking.clickSavingsAccount();

	}

	@Then("The Savings Account Page Should Be Opened")
	public void the_Savings_Account_Page_Should_Be_Opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/savings_account.html";
		Thread.sleep(2500);
		Assert.assertEquals(actual, expected);

	}

	// Navigate - Fixed Deposits Page

	@When("I Click on Fixed Deposits Button")
	public void i_Click_on_Fixed_Deposits_Button() {
		PrimusBank_PersonalBanking pbpersonalbanking = new PrimusBank_PersonalBanking(driver);
		pbpersonalbanking.clickFixedDeposits();

	}

	@Then("The Fixed Deposits Page Should Be Opened")
	public void the_Fixed_Deposits_Page_Should_Be_Opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/fixed_deposits.html";
		Thread.sleep(2500);
		Assert.assertEquals(actual, expected);

	}

	// Navigate - Money Transfer Page

	@When("I Click on Money Transfer Button")
	public void i_Click_on_Money_Transfer_Button() {
		PrimusBank_PersonalBanking pbpersonalbanking = new PrimusBank_PersonalBanking(driver);
		pbpersonalbanking.clickMoneyTransfer();
	}

	@Then("The Money Transfer Page Should Be Opened")
	public void the_Money_Transfer_Page_Should_Be_Opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/moneytrans.html";
		Thread.sleep(2500);
		Assert.assertEquals(actual, expected);

	}

	// Navigate - Cards Page

	@When("I Click on Cards Button")
	public void i_Click_on_Cards_Button() {
		PrimusBank_PersonalBanking pbpersonalbanking = new PrimusBank_PersonalBanking(driver);
		pbpersonalbanking.clickCards();
	}

	@Then("The Cards Page Should Be Opened")
	public void the_Cards_Page_Should_Be_Opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/cards.html";
		Thread.sleep(2500);
		Assert.assertEquals(actual, expected);

	}

	// Navigate - Loans Page

	@When("I Click on Loans Button")
	public void i_Click_on_Loans_Button() {
		PrimusBank_PersonalBanking pbpersonalbanking = new PrimusBank_PersonalBanking(driver);
		pbpersonalbanking.clickLoans();
	}

	@Then("The Loans Page Should Be Opened")
	public void the_Loans_Page_Should_Be_Opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/loans.html";
		Thread.sleep(2500);
		Assert.assertEquals(actual, expected);

	}

	// Navigate - Payments Page

	@When("I Click on Payments Button")
	public void i_Click_on_Payments_Button() {
		PrimusBank_PersonalBanking pbpersonalbanking = new PrimusBank_PersonalBanking(driver);
		pbpersonalbanking.clickPayments();
	}

	@Then("The Payments Page Should Be Opened")
	public void the_Payments_Page_Should_Be_Opened() throws InterruptedException {
		String actual = driver.getCurrentUrl();
		String expected = "http://primusbank.qedgetech.com/payments.html";
		Thread.sleep(2500);
		Assert.assertEquals(actual, expected);

	}

}
