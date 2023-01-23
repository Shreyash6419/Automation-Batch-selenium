package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act1 = new Actions(driver);
		
		
		//Type-1
		act1.moveToElement(rightclick).perform();
		
		act1.contextClick().perform();
		
		//Type-2
		//act1.contextClick(rightclick).perform();
		
		//type-3
		
		//act1.moveToElement(rightclick).contextClick().build().perform();

	}

}
