package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement locat1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dist1 = driver.findElement(By.id("amt8"));
		
		Actions act1 = new Actions(driver);
		
		act1.dragAndDrop(locat1, dist1).build().perform();
		

	}

}
