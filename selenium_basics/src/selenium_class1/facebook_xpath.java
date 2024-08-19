package selenium_class1;

import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://www.facebook.com");
	s.findElement(By.xpath("//input[@id='email']")).sendKeys("ajaykumar123@");
	s.findElement(By.xpath("//input[@name='pass']")).sendKeys("ajay321");
	s.findElement(By.xpath("login")).click();
	Thread.sleep(6000);
	s.quit();
}
}
