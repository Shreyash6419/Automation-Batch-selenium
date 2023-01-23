package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_right1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement click1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act1= new Actions(driver);
		
		act1.moveToElement(click1).contextClick().build().perform();
		
		WebElement click2 = driver.findElement(By.xpath("//li/span[text()='Delete']"));
		
		
		act1.moveToElement(click2).click().build().perform();
		
		
		
		
		
		
		
		
		

	}

}
