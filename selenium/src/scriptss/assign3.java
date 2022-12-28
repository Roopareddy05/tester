package scriptss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);	
	}

}
