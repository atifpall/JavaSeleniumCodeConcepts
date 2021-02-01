package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		//1: id
		//driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("naveenautomationlabs");
		//driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("naveen");
		
		
		//WebElement domain = driver.findElement(By.id("Form_submitForm_subdomain"));
		//domain.sendKeys("naveenautomationlabs");
		
		
		//2. By locators: OR (Object repositories)
		By domain = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitButton = By.id("Form_submitForm_action_request");
		
		//driver.findElement(domain).sendKeys("naveenautomationlabs");
		//driver.findElement(firstname).sendKeys("naveen");
		//driver.findElement(lastname).sendKeys("labs");
		
		
//		WebElement domain_ele = driver.findElement(domain);
//		WebElement firstname_ele = driver.findElement(firstname);
//		WebElement lastname_ele = driver.findElement(lastname);
//		
//		domain_ele.sendKeys("naveenautomationlabs");
//		firstname_ele.sendKeys("naveen");
//		lastname_ele.sendKeys("labs");
		
//		WebElementConcept.getElement(domain).sendKeys("naveenautomationlabs");
//		WebElementConcept.getElement(firstname).sendKeys("naveen");
//		WebElementConcept.getElement(lastname).sendKeys("labs");
		
		doSendKeys(domain, "naveenautomationlabs");
		doSendKeys(firstname, "naveen");
		doSendKeys(lastname, "labs");
		doClick(submitButton);
		
		

		//driver.quit();	
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	
	
	
	
	
	

}
