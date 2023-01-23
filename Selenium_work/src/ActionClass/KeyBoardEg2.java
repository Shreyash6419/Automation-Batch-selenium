package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class KeyBoardEg2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement cl1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		Actions act1 = new Actions(driver);
		
		act1.click(cl1).perform();
		
		WebElement cl2 = driver.findElement(By.id("day"));
		
		act1.click(cl2).perform();
		
		for(int i=0;i<=6;i++) {
		
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		}
		
		act1.sendKeys(Keys.ENTER).perform();
		
		WebElement cl3 = driver.findElement(By.id("month"));
		
		act1.click(cl3).perform();
		
		for(int i=0;i<=6;i++) {
		
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		}
		
		act1.sendKeys(Keys.ENTER).perform();
		
		 File srs1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File des1 = new File("C:\\Users\\hp\\Desktop\\Screenshot\\screenfacebook.jpg");
		 
		 FileHandler.copy(srs1, des1);
		
		
		
		
		

	}

}
