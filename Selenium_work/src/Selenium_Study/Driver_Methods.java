package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nobroker.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		String geturl = driver.getCurrentUrl();
		
		System.out.println(geturl);
		
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
