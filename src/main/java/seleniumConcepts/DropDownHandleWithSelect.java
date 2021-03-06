package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//WebElement industry_ele = driver.findElement(By.id("Form_submitForm_Industry"));
		//WebElement country_ele = driver.findElement(By.id("Form_submitForm_Country"));
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		//Select select = new Select(industry_ele);
		//select.selectByIndex(5);
		//select.selectByVisibleText("Electronics");
		//select.selectByValue("health");
		
		//Select select1 = new Select(country_ele);
		//select1.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		
		doSelectDropDownByVisibleText(industry, "Education");
		doSelectDropDownByVisibleText(country, "India");
		
		Thread.sleep(2000);
		
		driver.quit();
	
		
		
		
	}

}
