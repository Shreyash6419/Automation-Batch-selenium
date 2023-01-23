package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodUse {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(7000);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		WebElement FindOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result = FindOTP.isEnabled();
		
		System.out.println("GETOPT status is :"+result);
		
		WebElement Mob1 = driver.findElement(By.id("mobileNumber"));
		
		Mob1.sendKeys("9999999999");
		
		
		boolean result2 = FindOTP.isEnabled();
		
		System.out.println("GETOPT status is :"+result2);
		
		FindOTP.click();
	}
	
}
