package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethoduse {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//String title = driver.getTitle();
		
		//System.out.println("title of web page is :" +title);
		
		//System.out.println(driver.getTitle());
		
        String title1 = driver.getCurrentUrl();
		
		System.out.println("title of web page is :" +title1);

	}

}
