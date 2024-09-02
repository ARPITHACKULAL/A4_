package com.Ecommerce.Falcon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {
	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.flipkart.com/");
        Actions act=new Actions(driver);

        driver.findElement(By.xpath("//span[text()='Electronics']")).click();
      driver.findElement(By.xpath("//span[@class='TSD49J']")).click();
      Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("  //span[text()='Men'] "));
		act.moveToElement(ele).perform();
		List<WebElement>allselected=driver.findElements(By.xpath("//div[@class='jzpKY6']/div"));
		for(WebElement elements:allselected)
		{
			String value=elements.getText();
			System.out.println(value);
		}
	}

}