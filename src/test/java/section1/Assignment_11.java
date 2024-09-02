package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_11 {
	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        driver.findElement(By.xpath("//li[@class='selected']")).click();
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("blr");
        driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys("dxb");
        //driver.findElement(By.xpath("//span[text()='Dubai']")).click();
        
	}
	

}
