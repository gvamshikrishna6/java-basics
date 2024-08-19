package selenium_class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestion 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://www.google.com");
	s.manage().window().maximize();
	WebElement a1= s.findElement(By.name("q"));
	a1.sendKeys("Bangalore");
	Thread.sleep(2000);
	List<WebElement> a2= s.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count= a2.size();
	System.out.println(count);
	a2.get(9).click();
}
}
