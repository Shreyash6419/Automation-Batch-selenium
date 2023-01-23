package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropEg2 {

	public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement source1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement destin1 = driver.findElement(By.id("bank"));
		
		Actions act1 = new Actions(driver);
		
		act1.dragAndDrop(source1, destin1).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dst1 = driver.findElement(By.id("amt7"));
		
		act1.dragAndDrop(src1, dst1).perform();
		
		
		
		

	}

}
