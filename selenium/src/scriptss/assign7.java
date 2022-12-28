package scriptss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign7 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("file:///C:/Users/Roopa%20Reddy/Desktop/html/assign2.html");
	Thread.sleep(4000);
	driver.findElement(By.id("a1")).sendKeys("ABC");
	driver.findElement(By.id("a3")).click();
}
}
