package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("shreysh091");
		
		driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("953456@abc");
		
		driver.findElement(By.xpath("//button[@name ='login']")).click();
		
	}
		
		
		
		
		

	}

