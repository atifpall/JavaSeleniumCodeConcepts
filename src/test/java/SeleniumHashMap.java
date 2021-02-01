import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHashMap {

	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/SeleniumDemo/Workspace/SeleniumGridTest/fles/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		//System.out.println(getCredentialsMap());
		

		driver.findElement(By.name("username")).sendKeys(getUsername("seller"));
		driver.findElement(By.name("password")).sendKeys(getPassword("seller"));
		Thread.sleep(5000);
	
		driver.close();

		
		
		}
	
	public static HashMap<String,String> getCredentialsMap() 
	{
		HashMap<String,String> userMap = new HashMap<String,String>();
		
		userMap.put("user", "jst4automation@gmail.com:Ap@12345");
		userMap.put("customer", "jstautomation@facebook.com:Ap@12345");
		userMap.put("director", "jstDirectorautomation@yahoo.com:Ap@12345");
		userMap.put("seller", "jstsellerautomation@rediffmail.com:Ap@12345");
		
		return userMap;
		
	}
	
	public static String getUsername(String role) 
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getPassword(String role) 
	{
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}
	

}
