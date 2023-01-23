package Popup_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("I phone 14 max pro");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
