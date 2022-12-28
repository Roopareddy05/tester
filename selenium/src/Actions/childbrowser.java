package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class childbrowser 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{

	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	  WebElement ele = driver.findElement(By.xpath("//a[.='Help']")); 
	 
	  
	  Point loc = ele.getLocation(); 
	  int x = loc.getX();
	  int y = loc.getY(); 
	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  j.executeScript("window.scrollBy("+x+","+y+")"); 
	  Thread.sleep(2000);
	 
	  Actions a = new Actions(driver);
	  a.contextClick(ele).perform();  
	 Thread.sleep(2000);
	 
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	 r.keyRelease(KeyEvent.VK_T);
	 
	 Set<String> w = driver.getWindowHandles();
	 for(String all : w)
	 {
		 System.out.println(all);
		 driver.switchTo().window(all);
	 }
	 int how = w.size();
	 System.out.println(how);
	
}
}
