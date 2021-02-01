package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementSpiceJet {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
		
		By login = By.linkText("LOGIN / SIGNUP");
		WebElement login_ele = driver.findElement(login);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login_ele).perform();
		
		Thread.sleep(4000);
		
		//driver.findElement(By.linkText("SpiceClub Members")).click();
		act.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).perform();
	
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Member Login")).click();
		
	

	}

}
