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

public class KeyBoardEg3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		WebElement day1 = driver.findElement(By.id("day"));
		
		WebElement month1 = driver.findElement(By.id("month"));
		
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(day1).click().build().perform();
		
		for(int i=0;i<=7;i++)
		{
			act1.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act1.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		act1.moveToElement(month1).click().build().perform();
		
		for(int i=0;i<=8;i++)
		{
			act1.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act1.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement clk1 = driver.findElement(By.xpath("//label[text()='Male']"));
		
		act1.moveToElement(clk1).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File detiny1= new File("C:\\Users\\hp\\Desktop\\Screenshot\\facebook.png");
		
		FileHandler.copy(scr1, detiny1);
		
		
		
		
		
		
		
		

	}

}
