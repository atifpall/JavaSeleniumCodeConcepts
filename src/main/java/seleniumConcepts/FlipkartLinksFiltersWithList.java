package seleniumConcepts;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLinksFiltersWithList {

	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<String> getFilteredList(int timeOut, By webElementLocator, By locator, String value) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.visibilityOf(getElement(webElementLocator))).click();

		List<WebElement> flipkart_lists = driver.findElements(locator);
		System.out.println(flipkart_lists.size());

		List<String> final_filtered_list =

				flipkart_lists.stream().filter(ele -> !ele.getText().isEmpty())
						.filter(ele -> ele.getText().contains(value)).map(ele -> ele.getText().trim())
						.collect(Collectors.toList());

		return final_filtered_list;

	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		// OR: Object Repositories // By locators
		By button = By.cssSelector("div._2QfC02 button");
		By links = By.tagName("a");

		List<String> lists = getFilteredList(10, button, links, "Flipkart");
		for (String ele : lists) {
			System.out.println(ele);
		}

		driver.quit();
	}

}
