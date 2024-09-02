package section1;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		List<WebElement> allPnames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='KzDlHZ']/../following-sibling::div/div[@class='cN1yYO']/div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']"));
		Thread.sleep(3000);
		
		Iterator<WebElement> itr = allPnames.iterator();
		Iterator<WebElement> itr1 = allPrices.iterator();
		while (itr.hasNext() && itr1.hasNext())
		{
			Thread.sleep(1000);
			String pname = itr.next().getText();
			String price = itr1.next().getText();
			
			System.out.println(pname + "---->"+price);
		
		}
		driver.quit();

	}

}
