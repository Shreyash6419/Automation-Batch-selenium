package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://www.demo.guru99.com/test/drag_drop.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		
		WebElement destin1 = driver.findElement(By.id("amt7"));
		
		Actions act1 = new Actions(driver);
		
		//act1.moveToElement(source).clickAndHold().moveToElement(destin1).release().build().perform();
		
		act1.dragAndDrop(source, destin1).perform();
	}

}
