package ActionClass;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement right1 = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act2 = new Actions(driver);
		
		act2.moveToElement(right1).contextClick().build().perform();
		
		act2.moveToElement(right1).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement duble1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act2.moveToElement(duble1).doubleClick().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		Alert r1 = driver.switchTo().alert();
		
		System.out.println(r1.getText());
		
		r1.accept();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//		
//		driver.close();

		
		
		
		
		
		
		
		
		

	}

}
