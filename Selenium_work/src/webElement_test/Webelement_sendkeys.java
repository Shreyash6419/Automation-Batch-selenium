package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		
	    driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("Syk_45@rediffmail.com");
	    
	    Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//input[@id ='email']")).clear();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("Shreyash");

	}

}
