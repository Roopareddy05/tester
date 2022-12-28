package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class actitime extends genericacttime
{
@Test
public void test()
{
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");	
	driver.findElement(By.xpath("//div[.='Login ']")).click();	
}
}
