package section1;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {
	public static void main(String[] args)throws Exception {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		String date=sdf.format(d);
		System.out.println(date);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(date);
		
		
	}

}
