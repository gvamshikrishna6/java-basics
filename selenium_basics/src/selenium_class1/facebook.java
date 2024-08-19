package selenium_class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver s=new ChromeDriver();
	s.get("https://www.facebook.com");
	Thread.sleep(6000);
	s.close();
	
}
}
