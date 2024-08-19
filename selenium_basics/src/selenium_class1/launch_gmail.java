package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_gmail 
{
public static void main(String[] args)
{

	ChromeDriver s= new ChromeDriver();
	s.get("https://www.google.com");
	s.manage().window().maximize();
	WebElement gmail=s.findElement(By.partialLinkText("Gmail"));
	gmail.click();
}
}
