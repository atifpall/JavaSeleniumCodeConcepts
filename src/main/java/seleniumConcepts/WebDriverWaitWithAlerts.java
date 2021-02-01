package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitWithAlerts {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

//		Alert alert = isAlertPresent(5);
//		System.out.println(alert.getText());
//		alert.accept();

		System.out.println(getAlertText(5));
		doAcceptAlert(5);

	}

	public static Alert isAlertPresent(int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public static String getAlertText(int timeOut) {
		return isAlertPresent(timeOut).getText();
	}

	public static void doAcceptAlert(int timeOut) {
		isAlertPresent(timeOut).accept();
	}

	public static void doDismissAlert(int timeOut) {
		isAlertPresent(timeOut).dismiss();
	}

}
