package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_method3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.navigate().to("https://www.redbus.in/bus-tickets");

		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//driver.manage().window().minimize();
		
		//Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		driver.close();
		

	}

}
