package iframeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		

	}

}
