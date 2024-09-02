package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {
	public static void main(String[] args) {
		String expectedData="flipkart";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualData=driver.getCurrentUrl();
		if(actualData.contains(expectedData)) {
			System.out.println("ACCESED FLIPKART SUCCESSFULLY");
		}else {
			System.out.println("not accessed");
		}
		
		
	}

}
