package webelement;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class draganddrop 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	Point p = new Point(500, 500);
	driver.manage().window().setPosition(p);
}
}
