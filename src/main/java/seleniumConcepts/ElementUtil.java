package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	// ********************Drop_Down_Utils**********************

	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void selectDropDownValue(By locator, String value) {
		List<WebElement> optionList = getElements(locator);

		System.out.println(optionList.size());

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	public void selectFromSuggestList(By suggestionList, String value) {
		List<WebElement> resultList = getElements(suggestionList);
		System.out.println(resultList.size());

		for (WebElement e : resultList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

//************************* Action Utils *************************
	public List<String> getRightClickMenuList(By rightClickLocator, By listLocator) {

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		List<String> rightClickList = new ArrayList<String>();
		List<WebElement> menuList = getElements(listLocator);
		System.out.println(menuList.size());
		for (WebElement e : menuList) {
			String text = e.getText();
			rightClickList.add(text);
		}
		return rightClickList;

	}

	public void rightClickOption(By rightClickLocator, By listLocator, String value) {

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightClickLocator)).perform();
		List<WebElement> menuList = getElements(listLocator);
		System.out.println(menuList.size());
		for (WebElement e : menuList) {
			String text = e.getText();
			if (text.contentEquals(value)) {
				e.click();
				break;
			}
		}

	}
//************************** WebDriverWaitUtils for Alerts ****************************

	public Alert isAlertPresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public String getAlertText(int timeOut) {
		return isAlertPresent(timeOut).getText();
	}

	public void doAcceptAlert(int timeOut) {
		isAlertPresent(timeOut).accept();
	}

	public void doDismissAlert(int timeOut) {
		isAlertPresent(timeOut).dismiss();
	}

}
