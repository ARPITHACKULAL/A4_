package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
						element.sendKeys("iphone11");
						element.submit();
						driver.findElement(By.xpath("//div[text()='Apple iPhone 11 (White, 64 GB) (Includes EarPods, Power Adapter)']")).click();
						Thread.sleep(4000);
						driver.quit();
				
		

	}

}
