package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		
		String hubUrl= "http://localhost:4444/wd/hub";
		
		//1
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("firefox");
		
		//2
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		//3
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		

	}

}
