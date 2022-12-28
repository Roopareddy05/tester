package scriptss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assign1
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);	
}
}
