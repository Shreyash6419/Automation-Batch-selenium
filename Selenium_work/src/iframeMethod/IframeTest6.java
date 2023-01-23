package iframeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.switchTo().frame("frame1");
		
		WebElement scr1 = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]"));
		
		System.out.println("msg from 1st web"+scr1.getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.switchTo().defaultContent();
		
		WebElement scr2 = driver.findElement(By.xpath("(//div[contains(@class,'pattern-backgound ')])[1]"));
		
		System.out.println(scr2.getText());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.switchTo().frame("frame2");
		
		WebElement scr3 = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]"));
		
		System.out.println(scr3.getText());
		
		
		
		
		

	}

}
