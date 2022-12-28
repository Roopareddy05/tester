package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendivision 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://www.redbus.in");	
	driver.findElement(By.xpath("//label[.='Date']")).click();
	driver.findElement(By.xpath("//td[.='17']")).click();

}
}
