package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_NewUser extends SeleniumHelper {

	private WebDriver primusbank_newuser;

	public PrimusBank_NewUser(WebDriver primusbank_newuser) {
		PageFactory.initElements(primusbank_newuser, this);
	}

	// Elements in New User Registration

	@FindBy(name = "lst_Roles")
	private WebElement roles_dropdown;

	@FindBy(name = "lst_Branch")
	private WebElement branch_dropdown;

	@FindBy(name = "DrCName")
	private WebElement customerid_dropdown;

	@FindBy(name = "Lbc_name")
	private WebElement customername_txtbox;

	@FindBy(name = "txtUname")
	private WebElement username_txtbox;

	@FindBy(name = "txtLpwd")
	private WebElement loginpassword_txtbox;

	@FindBy(name = "txtTpwd")
	private WebElement transactionpassword_txtbox;

	@FindBy(name = "BtnSubmit")
	private WebElement submit_button;

	@FindBy(name = "btnreset")
	private WebElement reset_button;

	@FindBy(name = "btnCancel")
	private WebElement cancel_button;

	// Actions Regarding New User Registration

	public void createNewUser(String roles, String branch, int customerid, String customername, String username,
			String loginpassword, String transactionpassword) {
		dropdown_selectbyvisibletext(roles_dropdown, roles);
		dropdown_selectbyvisibletext(branch_dropdown, branch);
		dropdown_selectbyindex(customerid_dropdown, customerid);
		sendKeys_OnElement(customername_txtbox, customername);
		sendKeys_OnElement(username_txtbox, username);
		sendKeys_OnElement(loginpassword_txtbox, loginpassword);
		sendKeys_OnElement(transactionpassword_txtbox, transactionpassword);

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
