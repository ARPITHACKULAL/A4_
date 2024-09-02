package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(1000);

	String text=driver.findElement(By.xpath("//div[@class='DayPicker-Body']/div/div[@aria-disabled='false' and @aria-selected='true']/div/p[@class=' todayPrice']")).getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	
}
}
