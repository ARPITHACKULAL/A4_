package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("samsung mobiles");
		element.submit();
		Thread.sleep(3000);
		String pname = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 FE (Graphite, 128 GB)']"))
				.getText();

		String price = driver.findElement(By.xpath(
				"//div[text()='SAMSUNG Galaxy S23 FE (Graphite, 128 GB)']/../../div[@class='col col-5-12 BfVC2z']/div/div/div[@class='Nx9bqj _4b5DiR']"))
				.getText();
		System.out.println(pname + "--------->" + price);
		driver.quit();

	}

}
