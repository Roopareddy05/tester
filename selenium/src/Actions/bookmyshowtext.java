package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bookmyshowtext 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Avatar: The Way of Water']")).click();
	Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//h1[.='Avatar: The Way of Water']"));
String text = ele.getText();
System.out.println(text);
}
}
