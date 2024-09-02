package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=708111563274&hvpos=&hvnetw=g&hvran");
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select sel=new Select(dropdown);

		sel.selectByVisibleText("Books");
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("books");
		search.submit();
		
	WebElement sort=driver.findElement(By.xpath("//select[@name='s']"));
	Select select=new Select(sort);	
select.selectByVisibleText("Price: High to Low");

		
		
	
		
		
		


	}

}
