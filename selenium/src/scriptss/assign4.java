package scriptss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign4
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.get("file:///C:/Users/Roopa%20Reddy/Desktop/html/fblogin.html");
	Thread.sleep(4000);
	driver.findElement(By.id("a1")).sendKeys("Roopa");
	driver.findElement(By.id("a2")).sendKeys("hello");
	driver.findElement(By.id("a3")).click();
}
}
