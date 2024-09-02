package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
Thread.sleep(4000);
driver.findElement(By.name("username")).sendKeys("Admin");
Thread.sleep(4000);
WebElement element = driver.findElement(By.name("password"));
element.sendKeys("admin123");
Thread.sleep(4000);
element.submit();




	}

}
