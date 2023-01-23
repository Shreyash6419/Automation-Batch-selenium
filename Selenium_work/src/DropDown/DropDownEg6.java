package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		WebElement day1 = driver.findElement( By.id("day"));
		
		WebElement month1 = driver.findElement( By.id("month"));
		
		WebElement year1 = driver.findElement( By.id("year"));
		
		//month1.click();
		
		Select s1 = new Select(day1);
		
		Select s2 = new Select(month1);
		
		Select s3 = new Select(year1);
		
		
		s1.selectByIndex(9);
		
		//s2.selectByVisibleText("Dec");
		
		s3.selectByValue("1990");
		
		List<WebElement> w1 = s2.getOptions();
		
		for(WebElement r1:w1) {
			
			System.out.println(r1.getText());
			
			System.out.println("==================================");
			
		}
//			String mon1 ="Jul";
		
//			
//			WebElement r1 = null;
//			if(mon1.equals(r1.getText()))
//			{
//				System.out.println(mon1);
//				//break;
//			}

	}

			
			
		
			
	}


