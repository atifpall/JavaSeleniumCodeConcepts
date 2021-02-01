package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllOptionsFromDropDown {

	//function that takes the By locator and returns the list of text of each option in the list:
	
	public static List<String> getoptionstextList(WebElement WebElement) {
		
		//We need list of text of each option, hence we will use ArrayList
			
		List<String> optionsLinkText = new ArrayList<>();
			
		Select select = new Select(WebElement);
		List<WebElement> options_list = select.getOptions();
		
		//System.out.println(options_list.size());
		
		for(WebElement e : options_list) {
			String text = e.getText();
			//System.out.println(text);
			
			optionsLinkText.add(text);
			}
			return optionsLinkText;
		}
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		WebElement industry_ele=driver.findElement(industry);
		WebElement country_ele=driver.findElement(country);
		
//		Select select = new Select(industry_ele);
//		List<WebElement> indus_options_list = select.getOptions();
//		
//		System.out.println(indus_options_list.size());
//		
//		for(WebElement e:indus_options_list) {
//			System.out.println(e.getText());
//			
//			if(e.getText().equals("Education")) {
//				e.click();
//				break;
//			}
//		}
		
		List<String> indus_list = getoptionstextList(industry_ele);
		System.out.println(indus_list);
		System.out.println("------------");
		List<String> country_list = getoptionstextList(country_ele);
		System.out.println(country_list);
		
	}

}
