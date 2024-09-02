package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Arpi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("arpitha646");
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		driver.switchTo().defaultContent();



		
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);


		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("arpitha575@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("arpitha646");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("arpitha646");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		
		
	}

}
