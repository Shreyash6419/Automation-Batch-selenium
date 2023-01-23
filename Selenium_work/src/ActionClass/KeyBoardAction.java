package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement createnew = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		
		Actions do1 = new Actions(driver);
		
		do1.click(createnew).perform();
		
		Thread.sleep(3000);
		
		WebElement usedate = driver.findElement(By.id("day"));
		
		do1.click(usedate).perform();
		
		Thread.sleep(500);
		do1.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		Thread.sleep(500);
		do1.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(500);
		do1.sendKeys(Keys.ARROW_DOWN).perform();
		
		do1.sendKeys(Keys.ENTER).perform();
		
		
		WebElement usemon = driver.findElement(By.id("month"));
		
		Thread.sleep(500);
		
		do1.click(usemon).perform();
		
		for(int i=0;i<=6;i++)
		{	
		do1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(400);
		}
		
		do1.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		

	}

}
