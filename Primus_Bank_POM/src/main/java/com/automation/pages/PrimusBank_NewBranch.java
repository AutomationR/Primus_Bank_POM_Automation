package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_NewBranch extends SeleniumHelper {

	private WebDriver primusbank_newbranch;

	public PrimusBank_NewBranch(WebDriver primusbank_newbranch) {
		PageFactory.initElements(primusbank_newbranch, this);
	}

	// Elements in Form

	@FindBy(name = "txtbName")
	private WebElement branchname_txtbox;

	@FindBy(name = "txtAdd1")
	private WebElement address1_txtbox;

	@FindBy(name = "Txtadd2")
	private WebElement address2_txtbox;

	@FindBy(name = "txtadd3")
	private WebElement address3_txtbox;

	@FindBy(name = "txtArea")
	private WebElement area_txtbox;

	@FindBy(name = "txtZip")
	private WebElement zipcode_txtbox;

	@FindBy(name = "lst_counrtyU")
	private WebElement country_dropdown;

	@FindBy(name = "lst_stateI")
	private WebElement state_dropdown;

	@FindBy(name = "lst_cityI")
	private WebElement city_dropdown;

	@FindBy(name = "btn_insert")
	private WebElement submit_button;

	@FindBy(name = "Btn_Reset")
	private WebElement reset_button;

	@FindBy(name = "Btn_cancel")
	private WebElement cancel_button;

	// Actions Related to the Registration

	public void enterBranchDetails(String branchname, String address1, String address2, String address3, String area,
			String zipcode, String country, String state, String city) {
		sendKeys_OnElement(branchname_txtbox, branchname);
		sendKeys_OnElement(address1_txtbox, address1);
		sendKeys_OnElement(address2_txtbox, address2);
		sendKeys_OnElement(address3_txtbox, address3);
		sendKeys_OnElement(area_txtbox, area);
		sendKeys_OnElement(zipcode_txtbox, zipcode);
		dropdown_selectbyvisibletext(country_dropdown, country);
		dropdown_selectbyvisibletext(state_dropdown, state);
		dropdown_selectbyvisibletext(city_dropdown, city);
	}

	public void clickSubmit() {
		click_OnElement(submit_button);
	}

	public void clickReset() {
		click_OnElement(reset_button);
	}

	public void clickCancel() {
		click_OnElement(cancel_button);
	}

}
