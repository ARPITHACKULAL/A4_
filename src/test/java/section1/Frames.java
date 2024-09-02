package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws Exception{
		String username="Admin@gmail.com";
		String password="Admin@1234";
        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(3000);
        driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//input[@type='email']"));
		element.sendKeys(username);
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(password);
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		Thread.sleep(3000);
        WebElement element1=driver.findElement(By.xpath("//input[@id='password']"));
        		element1.sendKeys(password);
        		Thread.sleep(3000);
        		element1.click();

		

		
		
	}

}
