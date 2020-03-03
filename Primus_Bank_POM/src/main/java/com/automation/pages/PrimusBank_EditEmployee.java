package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_EditEmployee extends SeleniumHelper  {
	
	private WebDriver primusbank_editemployee;
	
	public PrimusBank_EditEmployee(WebDriver primusbank_editemployee) {
		PageFactory.initElements(primusbank_editemployee, this);
	}
	
	// Elements in Update Employee
	
	@FindBy(name = "txtBnameU")
	private WebElement employername_txtbox;
	
	@FindBy(name = "txtPwdU")
	private WebElement loginpassword_txtbox;
	
	@FindBy(name = "lstrolesU")
	private WebElement role_dropdown;
	
	@FindBy(name = "lstBidU")
	private WebElement branch_dropdown;
	
	@FindBy(name = "BtnUpdate")
	private WebElement update_button;
	
	@FindBy(name = "btncancelU")
	private WebElement cancel_button;

	// Actions Regarding Update Employee
	
	public void updateEmployee(String employername, String loginpassword, String role, String branch) {
		
		clear_Element(employername_txtbox);
		sendKeys_OnElement(employername_txtbox, employername);
		
		clear_Element(loginpassword_txtbox);
		sendKeys_OnElement(loginpassword_txtbox, loginpassword);
		
		dropdown_selectbyvisibletext(role_dropdown, role);
		dropdown_selectbyvisibletext(branch_dropdown, branch);
		
	}
	
	public void clickUpdate() {
		click_OnElement(update_button);
	}
	
	public void clickCancel() {
		click_OnElement(cancel_button);
	}
}
