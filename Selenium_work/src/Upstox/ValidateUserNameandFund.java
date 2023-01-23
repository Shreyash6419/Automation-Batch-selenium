package Upstox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrolling.ScrollingFuncation;

public class ValidateUserNameandFund {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://login-v2.upstox.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.id("mobileNum")).sendKeys("8888809639");
		
		WebElement otp = driver.findElement(By.id("getOtp"));
		
		if(otp.isEnabled())
		{
			System.out.println("Otp tab is active now please proceed");
		}
		
		otp.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.findElement(By.id("otpNum")).sendKeys("428015");
		
		driver.findElement(By.id("continueBtn")).click();
		
		//click on no thanks go to home page 
		
		driver.findElement(By.xpath("(//buttom[@type='button'])[9]")).click();
		
		//navigate to home page
		
		
		
		WebElement user1 = driver.findElement(By.xpath("(//buttom[@type='button'])[9]"));
		
		ScrollingFuncation.scrollintoView(driver, user1);
		
		

	}

}
