package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActionTest4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
	
		driver.get("https://vctcpune.com/selenium/practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		 WebElement box1 = driver.findElement(By.id("checkBoxOption1"));
		 
		 Actions act1 = new Actions(driver);
		 
		 act1.moveToElement(box1).click().build().perform();
	}

}
