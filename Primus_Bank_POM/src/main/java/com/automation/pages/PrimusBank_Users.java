package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Users extends SeleniumHelper {

	private WebDriver primusbank_users;

	public PrimusBank_Users(WebDriver primusbank_users) {
		PageFactory.initElements(primusbank_users, this);
	}

	// Elements in Search Users

	@FindBy(name = "lst_branchS")
	private WebElement branches_dropdown;

	@FindBy(name = "lst_rolesS")
	private WebElement roles_dropdown;

	@FindBy(name = "btn_search")
	private WebElement search_button;

	@FindBy(name = "btn_clear")
	private WebElement clear_button;

	// New User Element

	@FindBy(name = "Btnuser")
	private WebElement newuser_button;

	// Actions Regarding Search Users

	public void searchUser() {

		dropdown_selectbyvisibletext(branches_dropdown, "Dubhai");
		dropdown_selectbyvisibletext(roles_dropdown, "Savings");

	}

	public void clickSearch() {

		click_OnElement(search_button);
	}

	public void clickClear() {

		click_OnElement(clear_button);

	}

	// Action to Click New User

	public void clickNewUser() {

		click_OnElement(newuser_button);

	}

	public void verifyNewUser() {
		Assert.assertEquals(primusbank_users.getCurrentUrl(), "http://primusbank.qedgetech.com/userdetails.aspx");
	}

}
