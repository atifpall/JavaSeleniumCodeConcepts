package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTesting {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.MAC);
		cap.setBrowserName("firefox");
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl= "http://10.91.77.46:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap);
		
		
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.close();	
	}

}
