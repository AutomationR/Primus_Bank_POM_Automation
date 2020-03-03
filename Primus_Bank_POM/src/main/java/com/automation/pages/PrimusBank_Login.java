package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Login extends SeleniumHelper {

	private WebDriver primusbank_login;

	public PrimusBank_Login(WebDriver primusbank_login) {
		PageFactory.initElements(primusbank_login, this);
	}

	// Login Elements

	@FindBy(name = "idtxt")
	private WebElement username_txtbox;

	@FindBy(name = "pswdtxt")
	private WebElement password_txtbox;

	@FindBy(name = "btnGO")
	private WebElement login_button;

	// Navigation Elements

	@FindBy(linkText = "Home")
	private WebElement home_link;

	@FindBy(linkText = "About Us")
	private WebElement aboutus_link;

	@FindBy(linkText = "Contact")
	private WebElement contact_link;

	// Actions Regarding Login

	public void enterLoginDetails(String username, String password) {
		sendKeys_OnElement(username_txtbox, username);
		sendKeys_OnElement(password_txtbox, password);
	}

	public void clickLogin() {
		click_OnElement(login_button);
	}

	// Actions Regarding Navigation

	public void clickHome() {
		click_OnElement(home_link);
	}

	public void clickAboutUs() {
		click_OnElement(aboutus_link);
	}

	public void clickContact() {
		click_OnElement(contact_link);
	}

}
