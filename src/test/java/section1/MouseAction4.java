package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
        driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
        driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
       WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
      WebElement mobileAccessories= driver.findElement(By.xpath(" //div[text()='Mobile Accessories']")); 
       act.dragAndDrop(mobile,mobileAccessories ).perform();
       
       WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
       act.dragAndDrop(mobileCover,mobileAccessories ).perform();
       
       WebElement laptopcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
       WebElement laptopAccessories=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
       act.dragAndDrop(laptopcharger,laptopAccessories ).perform();
       
       WebElement laptopcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
       act.dragAndDrop(laptopcover,laptopAccessories ).perform();


       
        


	}

}
