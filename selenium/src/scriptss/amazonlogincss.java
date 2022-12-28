package scriptss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonlogincss 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("vivo phones");
	driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
	driver.findElement(By.cssSelector("span[class=\'a-size-medium a-color-base a-text-normal\']")).click();

}
}
