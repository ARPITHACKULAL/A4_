package section1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActions4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element1=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element1.sendKeys("i phone 14");
		element1.submit();
		Robot r= new Robot();
		for(int i=0;i<=10;i++)
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1000);
		}

	}

}
