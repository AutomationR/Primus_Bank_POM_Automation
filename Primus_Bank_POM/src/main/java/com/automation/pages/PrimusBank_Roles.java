package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Roles extends SeleniumHelper {

	private WebDriver primusbank_roles;

	public PrimusBank_Roles(WebDriver primusbank_roles) {
		PageFactory.initElements(primusbank_roles, this);
	}

	// New Role Element

	@FindBy(name = "btnRoles")
	private WebElement newrole_button;

	// Elements in Table

	@FindBy(xpath = "//*[@id=\"DGRoles\"]/tbody/tr[2]/td[4]/a") // Change with Respect to need
	private WebElement edit_icon;

	@FindBy(xpath = "//*[@id=\"DGRoles\"]/tbody/tr[2]/td[5]/a") // Change with Respect to need
	private WebElement delete_icon;

	@FindBy(linkText = "2") // Change with Respect to need
	private WebElement pages_navigation;

	// Action to Click New Role Button

	public void clickNewRole() {
		click_OnElement(newrole_button);
	}

	public void verifyNewRole() {
		Assert.assertEquals(primusbank_roles.getCurrentUrl(),
				"http://primusbank.qedgetech.com/Admin_Roles_details.aspx");
	}

	// Actions Related to Elements in Table

	public void clickEdit() {
		click_OnElement(edit_icon);
	}

	public void verifyEdit() {
		Assert.assertEquals(primusbank_roles.getCurrentUrl(),
				"http://primusbank.qedgetech.com/Admin_Roles_details.aspx");
	}

	public void clickDelete() {
		click_OnElement(delete_icon);
	}

	// Actions Related to Accept and Dismiss Alerts

	public void confirmAlert() {
		alert_accpet(primusbank_roles);
	}

	public void rejectAlert() {
		alert_cancel(primusbank_roles);
	}

}
