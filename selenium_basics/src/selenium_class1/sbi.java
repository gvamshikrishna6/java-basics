package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbi
{
public static void main(String[] args) 
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://retail.onlinesbi.sbi/retail/login.htm");
	s.manage().window().maximize();
	WebElement continue_to_login=s.findElement(By.partialLinkText("CONTINUE TO LOGIN"));
	continue_to_login.click();
	WebElement un=s.findElement(By.name("userName"));
	un.sendKeys("ajay123");
	WebElement pwd=s.findElement(By.name("password"));
	pwd.sendKeys("djsi234");
}
}
