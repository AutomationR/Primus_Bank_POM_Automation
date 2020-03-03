package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class PrimusBank_PersonalBanking extends SeleniumHelper {

	private WebDriver primusbank_personalbanking;

	public PrimusBank_PersonalBanking(WebDriver primusbank_personalbanking) {
		PageFactory.initElements(primusbank_personalbanking, this);
	}

	// Elements in Menu

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[2]/a")
	private WebElement home_link;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[3]/a")
	private WebElement personalbanking_link;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[4]/a")
	private WebElement corporatebanking_link;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[5]/a")
	private WebElement internationalbanking_link;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr/td[6]/a")
	private WebElement aboutus_link;

	// Elements in Personal Banking Section

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a")
	private WebElement savingsaccount_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a")
	private WebElement fixeddeposits_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[6]/td/a")
	private WebElement moneytransfer_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a")
	private WebElement cards_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[10]/td/a")
	private WebElement loans_button;

	@FindBy(xpath = "//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[12]/td/a")
	private WebElement payments_button;

	// Actions Related to Menu Elements

	public void clickHome() {
		click_OnElement(home_link);
	}

	public void clickPersonalBanking() {
		click_OnElement(personalbanking_link);
	}

	public void clickCorporateBanking() {
		click_OnElement(corporatebanking_link);
	}

	public void clickInternationalBanking() {
		click_OnElement(internationalbanking_link);
	}

	public void clickAboutUs() {
		click_OnElement(aboutus_link);
	}

	// Actions Related to Personal Banking Section Elements

	public void clickSavingsAccount() {
		click_OnElement(savingsaccount_button);
	}

	public void clickFixedDeposits() {
		click_OnElement(fixeddeposits_button);
	}

	public void clickMoneyTransfer() {
		click_OnElement(moneytransfer_button);
	}

	public void clickCards() {
		click_OnElement(cards_button);
	}

	public void clickLoans() {
		click_OnElement(loans_button);
	}

	public void clickPayments() {
		click_OnElement(payments_button);
	}
}
