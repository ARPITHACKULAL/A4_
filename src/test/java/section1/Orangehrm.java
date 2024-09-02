package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("arpitha");
		 driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("C");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kulal");
		 driver.findElement(By.xpath("//button[@type='submit']")).submit();

		


	}

}
