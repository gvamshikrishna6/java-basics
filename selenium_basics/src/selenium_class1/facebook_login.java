package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login 
{
public static void main(String[] args)
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://www.facebook.com");
	s.findElement(By.name("email")).sendKeys("ajaykumar123@");
	s.findElement(By.name("pass")).sendKeys("ajay321");
	s.findElement(By.name("login")).sendKeys(Keys.ENTER);
}
}
