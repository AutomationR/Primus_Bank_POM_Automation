package com.automation.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumHelper {

	/**
	 * methodname:mouseoveronelement
	 * 
	 * @param driver
	 * @param element example:SeleniumHelper.mouseoveronelement usage:to mouse over
	 *                on an element
	 */
	public static void mouseoveronelement(WebDriver driver, WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();

		} catch (Exception e) {
			System.out.println("unable to mouseover on the element");
		}

	}

	/**
	 * methodname:mouseoveronelement
	 * 
	 * @param driver
	 * @param element1
	 * @param element2 example:SeleniumHelper.mouseoveronelement usage:to mouse over
	 *                 on an element
	 */

	public static void mouseoveronelement(WebDriver driver, WebElement element1, WebElement element2) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element1).moveToElement(element2).build().perform();
		} catch (Exception e) {
			System.out.println("unable to mouseover on the element");
		}

	}

	/**
	 * methodname:capturescreenshot
	 * 
	 * @param driver
	 * @param filepath example:SeleniumHelper.capturescreenshot(driver,"D://example.png")
	 *                 usage:to capture screenshot
	 * 
	 */
	public static void capturescreenshot(WebDriver driver, String filepath) {

		try {
			File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(f1, new File(filepath + ".jpg"));
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("unable to save the screenshot in location " + filepath);
		}
	}

	/**
	 * methodname:dropdown_selectbyvisibletext
	 * 
	 * @param dropdownelement
	 * @param dropdownitemtext example:SeleniumHelper.dropdown_selectbyVisibletext(element,"May");
	 *                         uage:to select the value from dropdown using visible
	 *                         text
	 */
	public static void dropdown_selectbyvisibletext(WebElement dropdownelement, String dropdownitemtext) {
		try {
			Select s1 = new Select(dropdownelement);
			s1.selectByVisibleText(dropdownitemtext);

		} catch (Exception e) {
			System.out.println("unable to select from dropdown by visibletextmethod");
		}

	}

	public static void dropdown_selectbyindex(WebElement dropdownelement, int dropdownitemindex) {
		try {
			Select dropdown = new Select(dropdownelement);
			dropdown.selectByIndex(dropdownitemindex);
		}

		catch (Exception e) {
			System.out.println("unable to select from dropdown by index value");
		}
	}

	public static void dropdown_selectbyvalue(WebElement dropdownelement, String dropdownitemvalue) {
		try {
			Select dropdown = new Select(dropdownelement);
			dropdown.selectByValue(dropdownitemvalue);
		}

		catch (Exception e) {
			System.out.println("unable to select from dropdown by  value");
		}
	}

	// scroll window
	public static void scrollWindow(WebDriver driver) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)", "");
		} catch (Exception e) {
			System.out.println("unable to scroll window");
		}

	}

	public static void assert1(String act, String exp) {
		try {
			Assert.assertEquals(act, exp);

		} catch (Exception e) {
			System.out.println("invalid page navigation");
		}

	}

	public static void alert_accpet(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("unable to click on ok button");
		}

	}

	public static void alert_cancel(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("unable to click on cancel button");
		}

	}

	public static String alert_gettext(WebDriver driver) {
		try {

			String actualText = driver.switchTo().alert().getText();
			return actualText;

		} catch (Exception e) {
			System.out.println("unable to get text from alert box");
		}
		return null;

	}

	public static void framebyIndex(int indexvalue, WebDriver driver) {
		try {
			driver.switchTo().frame(indexvalue);
		} catch (Exception e) {
			System.out.println("unable to switch to frame by using id value");
		}

	}

	public static void framebyname(String framename, WebDriver driver) {
		try {
			driver.switchTo().frame(framename);
		} catch (Exception e) {
			System.out.println("unable to switch to frame by using frame name");
		}

	}

	public static void click_OnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("unable to click on the element");
		}

	}
	
	public static void clear_Element(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.out.println("unable to clear details on the element");
		}

	}

	public static void sendKeys_OnElement(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
			System.out.println("unable to find the element");
		}

	}

	public static void frameby_elementlocation(WebElement element, WebDriver driver) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			System.out.println("unable to switch to frame by using locator value");
		}

	}

	public static void frametoDefault(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();

		} catch (Exception e) {
			System.out.println("unable to switch to defaultcontent");
		}

	}

	/**
	 * method name:fileupload paramenters:path of the file
	 * example:SeleniumHandler.fileupload("D://example.png"); usage:To upload a file
	 * 
	 * @param filepath
	 */
	public static void fileupload(String filepath) {
		try {
			StringSelection select = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
			Robot robo = new Robot();

			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			System.out.println("unable to upload the file");
		}
	}

	/**
	 * 
	 * @param handle
	 * @param driver
	 */
	public static void getwindowhandles(Set<String> handle, WebDriver driver, String parent) {
		try {
			Iterator<String> ie = handle.iterator();
			while (ie.hasNext()) {
				String child = ie.next();
				if (!parent.equalsIgnoreCase(child)) {
					driver.switchTo().window(child);
				}
			}

		} catch (Exception e) {
			System.out.println("unable to switch the window");
		}

	}
}
