package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Orange {

	public static void main(String[] args) throws Exception{
		WebElement element=null;
				WebDriver driver=new ChromeDriver();

						driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(3000);
				element=driver.findElement(By.xpath("//h5[text()='Login']"));
				Thread.sleep(3000);
				System.out.println("login page verified:"+element.isDisplayed());
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);		
				element=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
				System.out.println("Dasboard page verified:"+element.isDisplayed());
				Thread.sleep(3000);		
				driver.findElement(By.xpath("//span[text()='Admin']")).click();
				Thread.sleep(3000);		
				element=driver.findElement(By.xpath("//h6[text()='Admin']"));
				
				System.out.println("admin page verified:"+element.isDisplayed());

				
				Thread.sleep(3000);	
				
				driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Arpi");
				
				Thread.sleep(3000);		
				
				driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(3000);	
				
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
				Thread.sleep(3000);	

				
				element=driver.findElement(By.xpath("//h5[text()='Login']"));	
				Thread.sleep(3000);	

				System.out.println("after logout login page displayed:"+element.isDisplayed());	
				
                 
				
	


	}
}