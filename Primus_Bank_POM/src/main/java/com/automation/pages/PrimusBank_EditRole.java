package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_EditRole extends SeleniumHelper {

	private WebDriver primusbank_editrole;

	public PrimusBank_EditRole(WebDriver primusbank_editrole) {
		PageFactory.initElements(primusbank_editrole, this);
	}

	// Elements in Role Updation

	@FindBy(name = "txtrNameU")
	private WebElement rolename_txtbox;

	@FindBy(name = "txtrdescU")
	private WebElement roledesc_txtbox;

	@FindBy(name = "lstRtype")
	private WebElement roletype_dropdown;

	@FindBy(name = "btnupdate")
	private WebElement update_button;

	@FindBy(name = "Btncancel")
	private WebElement cancel_button;

	// Actions Related to Update Role

	public void updateRole(String rolename, String roledesc, String roletype) {

		clear_Element(rolename_txtbox);
		sendKeys_OnElement(rolename_txtbox, rolename);

		clear_Element(roledesc_txtbox);
		sendKeys_OnElement(roledesc_txtbox, roledesc);

		dropdown_selectbyvisibletext(roletype_dropdown, roletype);

	}

	public void clickUpdate() {
		click_OnElement(update_button);
	}

	public void clickCancel() {
		click_OnElement(cancel_button);
	}

}
