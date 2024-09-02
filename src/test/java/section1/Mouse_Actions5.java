package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Actions5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        Actions act=new Actions(driver);
        driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
        driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
        driver.findElement(By.xpath("//a[text()='Time Picker Clock']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[text()='Pick Time']")).click();
        Thread.sleep(1000);
        WebElement drag=driver.findElement(By.xpath("//span[text()='12']"));
        WebElement drop=driver.findElement(By.xpath("//span[text()='10']"));
       
        act.dragAndDrop(drag, drop).perform();        WebElement drag1=driver.findElement(By.xpath("//span[text()='00']"));
        WebElement drop1=driver.findElement(By.xpath("//span[text()='30']"));
        act.dragAndDrop(drag1, drop1).perform();

	}

}
