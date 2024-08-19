package selenium_class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_launch{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver s=new ChromeDriver();
	s.get("https://www.amazon.in");
	Thread.sleep(8000);
	System.out.println(s.getWindowHandle());
	System.out.println(s.getWindowHandles());
 System.out.println(s.getTitle());

}
}