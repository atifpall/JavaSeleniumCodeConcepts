package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Thread.sleep(5000);
		
		By content = By.className("menulink");
		WebElement content_ele = driver.findElement(content);
		
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(content_ele).perform();
		
		Thread.sleep(7000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
		
	
		
		
		
		
		
		
		
	}

}
