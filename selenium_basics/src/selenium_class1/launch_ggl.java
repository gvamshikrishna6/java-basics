package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_ggl 
{
public static void main(String[] args)
{
	ChromeDriver s= new ChromeDriver();
	s.get("https://www.google.com");
 s.findElement(By.name("q")).sendKeys("India");
 s.findElement(By.name("btnK")).click();
}
}
