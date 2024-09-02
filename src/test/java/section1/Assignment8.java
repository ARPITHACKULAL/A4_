package section1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Assignment8 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='cod']")).click();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\FCI\\Pictures\\demo.png");
	System.out.println("Screenshot taken");
	Files.copy(src,dest);
	
	}

}
