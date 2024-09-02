package section1;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

public class Demo {



	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String expectedfname="Arpi";
		String expectedlname="c";
		for(int i=1;i<=2;i++)
		{
			Random r=new Random();
			int num=r.nextInt(1000);
			String expectedemail="arpi"+num+"@gmail.com";
			String expectedPass="sample"+num;
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(expectedfname+num);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(expectedlname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(expectedemail);
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(expectedPass);
	  WebElement element=  driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	element.sendKeys(expectedPass);
	    element.submit();
	   
	    String actualMail=driver.findElement(By.xpath("//a[contains(text(),'gmail.com')]")).getText();
	    if(actualMail.equalsIgnoreCase(expectedemail))
	    {
System.out.println("IT IS PASS"+num);
	    }
	    else
	    {
	    	System.out.println("fail"+num);
	    }
	    

	}

	}
}
