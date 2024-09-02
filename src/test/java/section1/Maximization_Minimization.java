package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximization_Minimization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String expectedTitle="Orange";
		String expectedUrl="orangehrm";
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.orangehrm.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(3000);
driver.manage().window().minimize();
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(3000);
String actualTitle=driver.getTitle();
String actualUrl=driver.getCurrentUrl();
Thread.sleep(3000);
if(actualTitle.contains(expectedTitle) && actualUrl.contains(expectedUrl)) {
	System.out.println("orange hrm home page displayed");
}else {
	System.out.println("not displayed");
}

driver.close();






	}

}
