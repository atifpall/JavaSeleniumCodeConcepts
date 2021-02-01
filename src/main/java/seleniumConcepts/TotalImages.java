package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("Total images in the amazon website: "+ imgList.size());
		
		
		for(int i=0; i<imgList.size();i++) {
			String altValue = imgList.get(i).getAttribute("alt");
			String srcUrl = imgList.get(i).getAttribute("src");
			System.out.println(srcUrl);
			System.out.println(altValue);
			
		}
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
