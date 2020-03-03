package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Branches extends SeleniumHelper {

	private WebDriver primusbank_branches;

	public PrimusBank_Branches(WebDriver primusbank_branches) {
		PageFactory.initElements(primusbank_branches, this);
	}

	// Elements in Menu

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[1]/a")
	private WebElement home_link;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[2]/a")
	private WebElement changepassword_link;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[3]/a")
	private WebElement logout_link;

	// Elements in the Page

	@FindBy(name = "BtnNewBR")
	private WebElement newbranch_button;

	// Elements related to Search

	@FindBy(name = "lst_countryS")
	private WebElement country_dropdown;

	@FindBy(name = "lst_stateS")
	private WebElement states_dropdown;

	@FindBy(name = "lst_cityS")
	private WebElement city_dropdown;

	@FindBy(name = "btn_search")
	private WebElement search_button;

	@FindBy(name = "btn_clsearch")
	private WebElement clear_button;

	// Elements in Table

	@FindBy(xpath = "//*[@id=\"DG_bankdetails\"]/tbody/tr[2]/td[7]/a") // Change with respect to needs
	private WebElement edit_icon;

	@FindBy(xpath = "//*[@id=\"DG_bankdetails\"]/tbody/tr[2]/td[8]/a") // Change with respect to needs
	private WebElement delete_icon;

	// Actions Related to Elements in the Page

	public void clickNewBranch() {
		click_OnElement(newbranch_button);
	}

	public void verifyNewBranch() {
		Assert.assertEquals(primusbank_branches.getCurrentUrl(),
				"http://primusbank.qedgetech.com/admin_banker_master.aspx");
	}

	// Actions Related to Elements in Search

	public void searchBranch() {
		dropdown_selectbyvalue(country_dropdown, "INDIA");
		dropdown_selectbyvalue(states_dropdown, "Tamil Nadu");
		dropdown_selectbyvalue(city_dropdown, "CHENNAI");
	}

	public void clickSearch() {
		click_OnElement(search_button);
	}

	public void clickClear() {
		click_OnElement(clear_button);
	}

	// Actions Related to Elements in Table

	public void clickEdit() {
		click_OnElement(edit_icon);
	}

	public void verifyEdit() {
		Assert.assertEquals(primusbank_branches.getCurrentUrl(),
				"http://primusbank.qedgetech.com/admin_banker_master.aspx");
	}

	public void clickDelete() {
		click_OnElement(delete_icon);
	}

	// Actions Related to Accept and Dismiss Alerts

	public void confirmAlert() {
		alert_accpet(primusbank_branches);
	}

	public void rejectAlert() {
		alert_cancel(primusbank_branches);
	}

	// To Perform Actions on Menu Elements

	public void clickHome() {
		click_OnElement(home_link);
	}

	public void verifyHome() {
		Assert.assertEquals(primusbank_branches.getCurrentUrl(), "http://primusbank.qedgetech.com/adminflow.aspx");
	}

	public void clickChangePassword() {
		click_OnElement(changepassword_link);
	}

	public void clickLogout() {
		click_OnElement(logout_link);
	}

	public void verifyLogout() {
		Assert.assertEquals(primusbank_branches.getCurrentUrl(), "http://primusbank.qedgetech.com/");
	}

}
