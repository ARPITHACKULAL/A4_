package section1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Assignment_9 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
	Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//a[text()='Login']"));
        Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenshotFolder\\"+"ss2"+".png");
		Files.copy(src, dest);
		Thread.sleep(3000);
		String parentId=driver.getWindowHandle();
		
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	
	Thread.sleep(1000);

	Set<String>allID=driver.getWindowHandles();
	for(String id:allID)
	{
		if(!parentId.equals(id))
		{
			driver.switchTo().window(id);
			break;
		}
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=708111563274&hvpos=&hvnetw=g&hvrand=10759245783994700065&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062009&hvtargid=kwd-64107830&hydadcr=14452_2391719&gad_source=1"));
WebElement ele = driver.findElement(By.xpath("//div[@class='nav-search-field ']"));
ele.click();
ele.submit();

	}

}
