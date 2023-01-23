package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod1 {

	public static void main(String[] args) {
	  
		

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Practice ')]")).click();

	}

}
