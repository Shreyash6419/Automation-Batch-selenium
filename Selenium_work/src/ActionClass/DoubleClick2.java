package ActionClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement click2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		System.out.println(click2.getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(click2).doubleClick().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		Alert b1 = driver.switchTo().alert();
		
		System.out.println(b1.getText());
		
		b1.accept();
		
		

	}

}
