package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import scrolling.ScrollingFuncation;

public class ClickActionTest6 {

	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement scr1 = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
		
		ScrollingFuncation.scrollintoView(driver, scr1);
		
		
		WebElement click1 = driver.findElement(By.xpath("//input[@value='Radio3']"));
		
		Actions act1 = new Actions(driver);
		
		
		act1.moveToElement(click1).click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File page1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File locate1= new File("C:\\Users\\hp\\Desktop\\Screenshot\\vctcpage.png");
		
		FileHandler.copy(page1, locate1);
		
		
		

	}

}
