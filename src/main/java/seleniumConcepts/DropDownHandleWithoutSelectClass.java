package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;
	
	public static void selectDropDownValue(By locator, String value) {
		List<WebElement> optionList= driver.findElements(locator);
		System.out.println(optionList.size());
		
		for(WebElement e:optionList ) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				e.click();
				break;
			}
			
			
		}

		
}
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industryOptions = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By countryOptions = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		
		selectDropDownValue(industryOptions, "Electronics");
		selectDropDownValue(countryOptions, "India");
		
				
		
		
		
		
		
		
	}
	
}
