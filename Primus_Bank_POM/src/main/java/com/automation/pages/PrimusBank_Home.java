package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_Home extends SeleniumHelper {

	private WebDriver primusbank_home;

	public PrimusBank_Home(WebDriver primusbank_home) {
		PageFactory.initElements(primusbank_home, this);
	}

	// Elements in Menu

	@FindBy(xpath = "//*[@id=\"Table_07\"]/tbody/tr/td[2]/a")
	private WebElement home_link;

	@FindBy(xpath = "//*[@id=\"Table_07\"]/tbody/tr/td[3]/a")
	private WebElement personalbanking_link;

	@FindBy(xpath = "//*[@id=\"Table_07\"]/tbody/tr/td[4]/a")
	private WebElement corporatebanking_link;

	@FindBy(xpath = "//*[@id=\"Table_07\"]/tbody/tr/td[5]/a")
	private WebElement internationalbanking_link;

	@FindBy(xpath = "//*[@id=\"Table_07\"]/tbody/tr/td[6]/a")
	private WebElement aboutus_link;

	// Elements in Customer Login Section

	@FindBy(name = "personal")
	private WebElement personal_button;

	@FindBy(name = "corporate")
	private WebElement corporate_button;

	@FindBy(name = "NRI")
	private WebElement international_button;

	// Elements in Banker Login Section

	@FindBy(name = "drlist")
	private WebElement selectbranch_dropdown;

	@FindBy(name = "txtuId")
	private WebElement username_txtbox;

	@FindBy(name = "txtPword")
	private WebElement password_txtbox;

	@FindBy(name = "login")
	private WebElement login_button;

	// Elements in Footer

	@FindBy(linkText = "Customer Service")
	private WebElement customerservice_link;

	@FindBy(linkText = "Internet Banking FAQ's")
	private WebElement internetbankingfaq_link;

	@FindBy(linkText = "Privacy")
	private WebElement privacy_link;

	@FindBy(linkText = "Terms and Conditions")
	private WebElement termsandconditions_link;

	@FindBy(linkText = "Disclaimer")
	private WebElement disclaimer_link;

	@FindBy(linkText = "Site Map")
	private WebElement sitemap_link;

	// Actions Related to Menu Elements

	public void clickHome() {
		click_OnElement(home_link);
	}

	public void verifyHome() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/home.aspx");
	}

	public void clickPersonalBanking() {
		// click_OnElement(personalbanking_link);
		try {
			Thread.sleep(5000);
			personalbanking_link.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void verifyPersonalBanking() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/personal_banking.html");
	}

	public void clickCorporateBanking() {
		click_OnElement(corporatebanking_link);
	}

	public void verifyCorporateBanking() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(),
				"http://primusbank.qedgetech.com/Corporate%20Banking.html");
	}

	public void clickInternationalBanking() {
		click_OnElement(internationalbanking_link);
	}

	public void verifyInternationalBanking() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(),
				"http://primusbank.qedgetech.com/International%20Banking.html");
	}

	public void clickAboutUs() {
		click_OnElement(aboutus_link);
	}

	public void verifyAboutUs() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/aboutus.html");
	}

	// Actions Related to Customer Login Elements

	public void clickPersonal() {
		click_OnElement(personal_button);
	}

	public void verifyPersonal() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/login.aspx");
	}

	public void clickCorporate() {
		click_OnElement(corporate_button);
	}

	public void verifyCorporate() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/login.aspx");
	}

	public void clickInternational() {
		click_OnElement(international_button);
	}

	public void verifyInternational() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/login.aspx");
	}

	// Actions Related to Banker Login Section

	public void bankerLogin(String username, String password, String branch) {
		dropdown_selectbyvisibletext(selectbranch_dropdown, branch);
		sendKeys_OnElement(username_txtbox, username);
		sendKeys_OnElement(password_txtbox, password);

	}

	public void bankerLoginDirect(String username, String password) {
		sendKeys_OnElement(username_txtbox, username);
		sendKeys_OnElement(password_txtbox, password);
	}

	public void clickLogin() {
		click_OnElement(login_button);

	}

	public void verifyLogin() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/adminflow.aspx");

	}

	// Actions Related to Footer Elements

	public void clickCustomerService() {
		click_OnElement(customerservice_link);
	}

	public void verifyCustomerService() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/customerServices.html");
	}

	public void clickInternetBankingFAQs() {
		click_OnElement(internetbankingfaq_link);
	}

	public void verifyInternetBankingFAQs() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/faqs.html");
	}

	public void clickPrivacy() {
		click_OnElement(privacy_link);
	}

	public void verifyPrivacy() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/privacy.html");
	}

	public void clickTermsAndConditions() {
		click_OnElement(termsandconditions_link);
	}

	public void verifyTermsAndConditions() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/terms&conditions.html");
	}

	public void clickDisclaimer() {
		click_OnElement(disclaimer_link);
	}

	public void verifyDisclaimer() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/disclaimer.html");
	}

	public void clickSiteMap() {
		click_OnElement(sitemap_link);
	}

	public void verifySiteMap() {
		Assert.assertEquals(primusbank_home.getCurrentUrl(), "http://primusbank.qedgetech.com/sitemap.html");
	}

}
