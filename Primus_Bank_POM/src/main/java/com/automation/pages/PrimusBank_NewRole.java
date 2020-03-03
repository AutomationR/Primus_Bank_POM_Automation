package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_NewRole extends SeleniumHelper {

	private WebDriver primusbank_newrole;

	public PrimusBank_NewRole(WebDriver primusbank_newrole) {
		PageFactory.initElements(primusbank_newrole, this);
	}

	// Elements in New Role Registration

	@FindBy(name = "txtRname")
	private WebElement rolename_txtbox;

	@FindBy(name = "txtRDesc")
	private WebElement roledesc_txtbox;

	@FindBy(name = "lstRtypeN")
	private WebElement roletype_dropdown;

	@FindBy(name = "btninsert")
	private WebElement submit_button;

	@FindBy(name = "Btn_Reset")
	private WebElement reset_button;

	@FindBy(name = "Btn_cancel")
	private WebElement cancel_button;

	// Actions Regarding registering New Role

	public void newRole(String rolename, String roledesc, String roletype) {
		sendKeys_OnElement(rolename_txtbox, rolename);
		sendKeys_OnElement(roledesc_txtbox, roledesc);
		dropdown_selectbyvisibletext(roletype_dropdown, roletype);
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
