package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrizBuzzPlayerStats {

	static WebDriver driver;
	
	public static List<String> getScoreCardPlayer(String playerName) {
		
		System.out.println("Getting score card of: "+playerName);
		
		String wicketTaker = driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::div/following-sibling::div/span")).getText();
		System.out.println("Wicket taker of " +playerName+ "is: "+ wicketTaker);
		
		List<String> scoreCardList = new ArrayList<String>();
		
		List<WebElement> scoreList = 
				driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::div/following-sibling::div"));
		
		for(int i=1; i<scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			scoreCardList.add(text);
		}
	
		return scoreCardList;
		
	}
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31633/aus-vs-ind-1st-odi-india-tour-of-australia-2020-21");
		
		List<String> scores = getScoreCardPlayer(" Mayank Agarwal ");
		System.out.println("Stats are as follows: " +scores);
		
		driver.quit();
		
		
		//String wicketTaker = driver.findElement(By.xpath("//a[text()=' Hardik Pandya ']//parent::div/following-sibling::div/span")).getText();
		//xpath for virat kohli : By.xpath("//a[text()=' Virat Kohli (c) ']//parent::div/following-sibling::div")).getText();
		
		//System.out.println(wicketTaker);
		
		
		
		//System.out.println(scoreList.size());
		
		
		
		
		
		
		
		
		
		
	}

}
