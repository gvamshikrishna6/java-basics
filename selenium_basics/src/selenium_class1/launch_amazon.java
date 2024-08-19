package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_amazon
{
public static void main(String[] args)
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://www.amazon.in ");
	s.manage().window().maximize();
	WebElement cust=s.findElement(By.partialLinkText("Customer Service"));
	cust.click();
}
}
