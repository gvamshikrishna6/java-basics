package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_google2
{
public static void main(String[] args)
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://www.google.com");
	s.manage().window().maximize();
	WebElement gmail=s.findElement(By.linkText("Gmail"));
	gmail.click();
}
}
