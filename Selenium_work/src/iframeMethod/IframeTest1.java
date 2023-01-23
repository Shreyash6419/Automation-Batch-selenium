package iframeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult"); // need to mention name or Id in frame function
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		

	}

}
