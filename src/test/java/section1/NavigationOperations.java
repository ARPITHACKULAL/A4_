package section1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class NavigationOperations {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
driver.navigate().to("https://www.orangehrm.com/")	;
	Navigation nav=driver.navigate();
driver.navigate().back();
//nav.back();
Thread.sleep(7000);
nav.forward();
Thread.sleep(5000);
nav.refresh();
driver.close();

	}
	}

