package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_NewEmployee extends SeleniumHelper {

	private WebDriver primusbank_newemployee;

	public PrimusBank_NewEmployee(WebDriver primusbank_newemployee) {
		PageFactory.initElements(primusbank_newemployee, this);
	}

	// Elements in New Employee Registration

	@FindBy(name = "txtUname")
	private WebElement employername_txtbox;

	@FindBy(name = "txtLpwd")
	private WebElement loginpassword_txtbox;

	@FindBy(name = "lst_Roles")
	private WebElement role_dropdown;

	@FindBy(name = "lst_Branch")
	private WebElement branch_dropdown;

	@FindBy(name = "BtnSubmit")
	private WebElement submit_button;

	@FindBy(name = "btnreset")
	private WebElement reset_button;

	@FindBy(name = "btnCancel")
	private WebElement cancel_button;

	// Actions Regarding New Employee Registration

	public void newEmployee(String employername, String loginpassword, String role, String branch) {

		sendKeys_OnElement(employername_txtbox, employername);
		sendKeys_OnElement(loginpassword_txtbox, loginpassword);
		sendKeys_OnElement(role_dropdown, role);
		sendKeys_OnElement(branch_dropdown, branch);

	}

	public void clickSubmit() {
		click_OnElement(submit_button);
	}

	public void clickReset() {
		click_OnElement(reset_button);
	}

	public void clickClear() {
		click_OnElement(cancel_button);

	}
}