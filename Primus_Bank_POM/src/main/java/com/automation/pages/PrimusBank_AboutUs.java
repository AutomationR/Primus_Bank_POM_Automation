package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_AboutUs extends SeleniumHelper {

	private WebDriver primusbank_aboutus;

	public PrimusBank_AboutUs(WebDriver primusbank_aboutus) {
		PageFactory.initElements(primusbank_aboutus, this);
	}

	// Elements in Header

	@FindBy(linkText = "Home")
	private WebElement home_link;

	@FindBy(linkText = "About Us")
	private WebElement aboutus_link;

	@FindBy(linkText = "Contact")
	private WebElement contact_link;

	// Elements in Menu

	@FindBy(name = "Image5")
	private WebElement nribanking_menuoption;

	@FindBy(name = "Image4")
	private WebElement corporatebanking_menuoption;

	@FindBy(name = "Image3")
	private WebElement personalbanking_menuoption;

	// Actions Related to Header Elements

	public void clickHome() {
		click_OnElement(home_link);
	}

	public void verifyHome() {
		Assert.assertEquals(primusbank_aboutus.getCurrentUrl(), "http://primusbank.qedgetech.com/chome.aspx");
	}

	public void clickAboutUs() {
		click_OnElement(aboutus_link);
	}

	public void verifyAboutUs() {
		Assert.assertEquals(primusbank_aboutus.getCurrentUrl(), "http://primusbank.qedgetech.com/aboutus.html");
	}

	public void clickContact() {
		click_OnElement(contact_link);
	}

	public void verifyContact() {
		Assert.assertEquals(primusbank_aboutus.getCurrentUrl(), "http://primusbank.qedgetech.com/contact.html");
	}

	// Actions Related to Menu Elements

	public void clickPersonalBanking() {
		click_OnElement(personalbanking_menuoption);
	}

	public void verifyPersonalBanking() {
		Assert.assertEquals(primusbank_aboutus.getCurrentUrl(),
				"http://primusbank.qedgetech.com/personal-banking.html");
	}

	public void clickCorporateBanking() {
		click_OnElement(corporatebanking_menuoption);
	}

	public void verifyCorporateBanking() {
		Assert.assertEquals(primusbank_aboutus.getCurrentUrl(),
				"http://primusbank.qedgetech.com/corporate-banking.html");
	}

	public void clickNRIBanking() {
		click_OnElement(nribanking_menuoption);
	}

	public void verifyNRIBanking() {
		Assert.assertEquals(primusbank_aboutus.getCurrentUrl(), "http://primusbank.qedgetech.com/NRI-banking.html");
	}
}
