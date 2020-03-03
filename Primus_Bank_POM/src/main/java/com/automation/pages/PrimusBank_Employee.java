package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Employee extends SeleniumHelper {

	private WebDriver primusbank_employee;

	public PrimusBank_Employee(WebDriver primusbank_employee) {
		PageFactory.initElements(primusbank_employee, this);
	}

	// New Role Element

	@FindBy(name = "BtnNew")
	private WebElement newemployee_button;

	// Elements in Table

	@FindBy(xpath = "//*[@id=\"DGBanker\"]/tbody/tr[2]/td[6]/a") // Change with Respect to need
	private WebElement edit_icon;

	@FindBy(xpath = "//*[@id=\"DGBanker\"]/tbody/tr[2]/td[7]/a") // Change with Respect to need
	private WebElement delete_icon;

	@FindBy(linkText = "2") // Change with Respect to need
	private WebElement pages_navigation;

	// Action to Click New Employee Button

	public void clickNewEmployee() {
		click_OnElement(newemployee_button);
	}

	public void verifyNewEmployee() {
		Assert.assertEquals(primusbank_employee.getCurrentUrl(),
				"http://primusbank.qedgetech.com/Admin_Emp_details.aspx");
	}

	// Actions Related to Elements in Table

	public void clickEdit() {
		click_OnElement(edit_icon);
	}

	public void clickDelete() {
		click_OnElement(delete_icon);
	}

	// Actions Related to Accept and Dismiss Alerts

	public void confirmAlert() {
		alert_accpet(primusbank_employee);
	}

	public void rejectAlert() {
		alert_cancel(primusbank_employee);
	}

}
