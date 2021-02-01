package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(3000);
		
		By searchBox = By.name("search_query");
		By autoSuggestions = By.xpath("//div[@class='ac_results']//li");
		
		driver.findElement(searchBox).sendKeys("dress");
		
		Thread.sleep(3000);
		
		List<WebElement> listOptions = driver.findElements(autoSuggestions);
		System.out.println(listOptions.size());
		
		for(WebElement e: listOptions) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("Summer Dresses > Printed Summer Dress")) {
				e.click();
				break;
			}
		}
		
	
		
		
		
		
		
	}

}
