package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {

	static WebDriver driver;
	
	
	//Using List
	public static List<String> getLangListTexts(By locator) {
		
		List<String> list = new ArrayList<String>();
		
		List<WebElement> langList = driver.findElements(locator);
		
		//System.out.println(langList.size());
		
		for(WebElement e: langList) {
			String text = e.getText();
			//System.out.println(text);
			list.add(text);
		}
			return list;
		
	}
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		By language_links = By.xpath("//div[@id='SIvCob']/a");
		
		List<String> optionsText = getLangListTexts(language_links);
		System.out.println(optionsText);
		
	}

}
