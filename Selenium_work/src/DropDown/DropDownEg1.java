package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		
		WebElement sday = driver.findElement(By.id("day"));
		WebElement smonth = driver.findElement(By.id("month"));
		WebElement syear = driver.findElement(By.id("year"));
		
		Select s1 = new Select(sday);
		Select s2 = new Select(smonth);
		Select s3 = new Select(syear);
		
		s1.selectByIndex(28);
		s2.selectByValue("12");
		s3.selectByVisibleText("2018");
		
		
		
		
		

	}

}
