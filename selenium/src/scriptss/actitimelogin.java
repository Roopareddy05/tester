package scriptss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitimelogin
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver  driver=new FirefoxDriver();
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");	
	driver.findElement(By.xpath("//div[.='Login ']")).click();	
	Thread.sleep(2000);
	String title = driver.getTitle();
	//System.out.println(title);
	if(title.equals("actiTIME - Enter Time-Track"))
	{
		System.out.println("tc is pass");
	}
	else
	{
		System.out.println("tc is fail");
	}
}
}
