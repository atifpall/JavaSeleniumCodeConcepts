package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	static WebDriver driver;
	
	public static void selectFromSuggestList(By suggestionList ,String value) {
		
		List<WebElement> resultList = driver.findElements(suggestionList);
		
		System.out.println(resultList.size());
		
		for(WebElement e: resultList) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		

		Thread.sleep(3000);
	
		//Defining locators
		By search = By.name("q");
		By suggestionList = By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span");
		
		driver.findElement(search).sendKeys("naveen automationlabs");
		
		Thread.sleep(3000);
			
		selectFromSuggestList(suggestionList, "naveen automationlabs cucumber");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
