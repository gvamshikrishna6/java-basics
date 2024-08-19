package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{
public static void main(String[] args) 
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://grotechminds.com/registration/");
	s.manage().window().maximize();
	WebElement i1= s.findElement(By.name("fname"));
	i1.sendKeys("ajay");
	i1.sendKeys(Keys.CONTROL+"a");
	i1.sendKeys(Keys.CONTROL+"c");
	WebElement i2= s.findElement(By.name("lname"));
	i2.sendKeys("ajay");
	
}
}
