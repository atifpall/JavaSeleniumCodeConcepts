package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(2000);

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// selectChoiceFromDropDown(choices, "choice 1");
		// selectChoiceFromDropDown(choices, "choice 1", "choice 6 2", "choice 6 2 3",
		// "choice 7");
		selectChoiceFromDropDown(choices, "ALL");

	}

	public static void selectChoiceFromDropDown(By locator, String... value) {

		List<WebElement> choiceList = driver.findElements(locator);
		// System.out.println(choiceList.size());

		if (!value[0].equalsIgnoreCase("All")) {

			for (int i = 0; i < choiceList.size(); i++) {

				String text = choiceList.get(i).getText();
				System.out.println(text);

				for (int j = 0; j < value.length; j++) {

					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}

				}
			}

		}

		// logic to select all the values
		else {
			try {
				for (WebElement e : choiceList) {
					e.click();
				}

			} catch (Exception e) {

			}

		}
	}

}
