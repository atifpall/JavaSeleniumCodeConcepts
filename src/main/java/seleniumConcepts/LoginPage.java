package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		
		String browserName = "chrome";

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		DriverFactory df = new DriverFactory();
		WebDriver driver = df.init_driver(browserName);
		df.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String title = df.doGetPageTitle();
		System.out.println("title of the page is: " +title );
		
		if(title.contains("Human Resource")) {
			System.out.println("correct page title...");
		}
		
		
		By domain = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitButton = By.id("Form_submitForm_action_request");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(domain, "naveenautomationlabs.com");
		eleUtil.doSendKeys(firstname, "naveen");
		eleUtil.doSendKeys(lastname, "labs");
		eleUtil.doClick(submitButton);
		
		
		
		
	}

}
