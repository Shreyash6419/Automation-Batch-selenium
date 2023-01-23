package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement dr1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act1= new Actions(driver);
		
		act1.moveToElement(dr1).perform();
		
		act1.doubleClick().perform();
		
		
		//act1.moveToElement(dr1).doubleClick().build().perform();
		
		
		
		

	}

}
