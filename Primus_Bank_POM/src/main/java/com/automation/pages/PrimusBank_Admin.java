package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Admin extends SeleniumHelper {

	private WebDriver primusbank_admin;

	public PrimusBank_Admin(WebDriver primusbank_admin) {
		PageFactory.initElements(primusbank_admin, this);
	}

	// Elements in Menu

	@FindBy(xpath = "//*[@id=\"Table_02\"]/tbody/tr/td[1]/a")
	private WebElement home_link;

	@FindBy(xpath = "//*[@id=\"Table_02\"]/tbody/tr/td[2]/a")
	private WebElement changepassword_link;

	@FindBy(xpath = "//*[@id=\"Table_02\"]/tbody/tr/td[3]/a")
	private WebElement logout_link;

	// Elements in Admin Section

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a")
	private WebElement branches_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a")
	private WebElement roles_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[6]/td/a")
	private WebElement users_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a")
	private WebElement employee_button;

	// To Perform Actions on Menu Elements

	public void clickHome() {
		click_OnElement(home_link);
	}

	public void verifyHome() {
		Assert.assertEquals(primusbank_admin.getCurrentUrl(), "http://primusbank.qedgetech.com/adminflow.aspx");
	}

	public void clickChangePassword() {
		click_OnElement(changepassword_link);
	}

	public void clickLogout() {
		click_OnElement(logout_link);
	}

	public void verifyLogout() {
		Assert.assertEquals(primusbank_admin.getCurrentUrl(), "http://primusbank.qedgetech.com/");
	}

	// To Perform Actions on Admin Section Elements

	public void clickBranches() {
		click_OnElement(branches_button);
	}

	public void verifyBranches() {
		Assert.assertEquals(primusbank_admin.getCurrentUrl(),
				"http://primusbank.qedgetech.com/admin_banker_master.aspx");
	}

	public void clickRoles() {
		click_OnElement(roles_button);
	}

	public void verifyRoles() {
		Assert.assertEquals(primusbank_admin.getCurrentUrl(),
				"http://primusbank.qedgetech.com/Admin_Roles_details.aspx");
	}

	public void clickUsers() {
		click_OnElement(users_button);
	}

	public void verifyUsers() {
		Assert.assertEquals(primusbank_admin.getCurrentUrl(), "http://primusbank.qedgetech.com/userdetails.aspx");
	}

	public void clickEmployee() {
		click_OnElement(employee_button);
	}

	public void verifyEmployee() {
		Assert.assertEquals(primusbank_admin.getCurrentUrl(), "http://primusbank.qedgetech.com/Admin_Emp_details.aspx");
	}

}
