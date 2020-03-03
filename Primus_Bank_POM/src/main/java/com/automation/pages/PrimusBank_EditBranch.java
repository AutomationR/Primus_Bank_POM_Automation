package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_EditBranch extends SeleniumHelper {

	private WebDriver primusbank_editbranch;

	public PrimusBank_EditBranch(WebDriver primusbank_editbranch) {
		PageFactory.initElements(primusbank_editbranch, this);
	}

	// Elements in Update Branch Form

	@FindBy(name = "txtbnameU")
	private WebElement branchname_txtbox;

	@FindBy(name = "txtadd1u")
	private WebElement address1_txtbox;

	@FindBy(name = "txtadd2u")
	private WebElement address2_txtbox;

	@FindBy(name = "txtadd3U")
	private WebElement address3_txtbox;

	@FindBy(name = "txtareaU")
	private WebElement area_txtbox;

	@FindBy(name = "txtzipu")
	private WebElement zipcode_txtbox;

	@FindBy(name = "drlst_countryU")
	private WebElement country_dropdown;

	@FindBy(name = "lst_stateU")
	private WebElement state_dropdown;

	@FindBy(name = "LST_cityU")
	private WebElement city_dropdown;

	@FindBy(name = "btnupdate")
	private WebElement update_button;

	@FindBy(name = "Btncancel")
	private WebElement cancel_button;

	// Actions Related to the Update Branch Details

	public void enterBranchDetails(String branchname, String address1, String address2, String address3, String area,
			String zipcode, String country, String state, String city) {

		clear_Element(branchname_txtbox);
		sendKeys_OnElement(branchname_txtbox, branchname);

		clear_Element(address1_txtbox);
		sendKeys_OnElement(address1_txtbox, address1);

		clear_Element(address2_txtbox);
		sendKeys_OnElement(address2_txtbox, address2);

		clear_Element(address3_txtbox);
		sendKeys_OnElement(address3_txtbox, address3);

		clear_Element(area_txtbox);
		sendKeys_OnElement(area_txtbox, area);

		clear_Element(zipcode_txtbox);
		sendKeys_OnElement(zipcode_txtbox, zipcode);

		dropdown_selectbyvisibletext(country_dropdown, country);
		dropdown_selectbyvisibletext(state_dropdown, state);
		dropdown_selectbyvisibletext(city_dropdown, city);
	}

	public void clickSubmit() {
		click_OnElement(update_button);
	}

	public void clickCancel() {
		click_OnElement(cancel_button);
	}
}
