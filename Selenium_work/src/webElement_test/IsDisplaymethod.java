package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplaymethod {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		WebElement Display1 = driver.findElement(By.id("displayed-text"));
		
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		
		hidebutton.click();
		
		showbutton.click();
		
		System.out.println(Display1.isDisplayed());
		
		Display1.sendKeys("text trial");

	}

}
