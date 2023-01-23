package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		
		WebElement smonth = driver.findElement(By.id("month"));
		
		Select s1 = new Select(smonth);
		
		if(s1.isMultiple())
		{
			System.out.println("this is mupltiple selected");
		}
		
		else
		{
			System.out.println("this is not multiselected selected");
		}

	}

}
