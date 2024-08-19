package selenium_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_1 {
	public static void main(String[] args) {
		ChromeDriver s = new ChromeDriver();
		s.get("https://www.amazon.in");
		s.manage().window().maximize();
		WebElement a1 = s.findElement(By.xpath("(//input)[5]"));
		a1.sendKeys("shoes" + Keys.ENTER);

	}
}
