package section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("i phone 14");
		element.submit();
		List<WebElement>elements=driver.findElements(By.xpath("//span[text()='Add to Compare']"));
		for(int i=0;i<=elements.size()-1;i++)
		{
			if(i==0 ||i==1|| i==22 || i==23)
			{
				elements.get(i).click();
				Thread.sleep(3000);
			}
		}
		
			
		

	}

}
