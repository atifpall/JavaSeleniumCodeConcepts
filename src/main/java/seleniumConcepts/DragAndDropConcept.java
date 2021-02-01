package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	static WebDriver driver;
	
	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By dragObject = By.id("draggable");
		By dropObject = By.id("droppable");
		
		WebElement drag_ele = driver.findElement(dragObject);
		WebElement drop_ele = driver.findElement(dropObject);
		
		Actions act = new Actions(driver);
		//act.clickAndHold(drag_ele).moveToElement(drop_ele).release().build().perform();
		
		act.dragAndDrop(drag_ele, drop_ele).perform();
		
		
		//driver.quit();	
		
	}

}
