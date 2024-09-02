package section1;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchingChrome {
	

		
	public static void main(String[]args) throws Exception{
			String expectedData="demoapps";
			String expectedTitle="DemoApps";
			String exepctedData="flipkart";
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoapps.qspiders.com");
			String actualDataUrl=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			System.out.println(actualDataUrl);
			System.out.println(actualTitle);

		
			if(actualTitle.contains(expectedTitle) && actualDataUrl.contains(exepctedData)) {
				System.out.println("ACCESED deoapps");
			}else {
				System.out.println("not accessed");
				
			}
			
		Thread.sleep(4000);
		driver.close();
		}

	}



