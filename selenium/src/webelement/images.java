package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class images 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	  List<WebElement> eles = driver.findElements(By.xpath("//img"));
	  int size = eles.size();
	  System.out.println(size);	
}
}
