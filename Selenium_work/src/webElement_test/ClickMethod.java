package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@value ='Radio1']")).click();
		
		driver.findElement(By.xpath("//input[@value ='Radio2']")).click();
		
		
		driver.findElement(By.xpath("//input[@value ='option1']")).click();
		
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		
		
		
		
		
		

	}

}
