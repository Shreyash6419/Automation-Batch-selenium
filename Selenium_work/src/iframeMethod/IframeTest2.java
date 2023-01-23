package iframeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		String text1 = driver.findElement(By.xpath(("(//h1[contains(text(),'This is a sample')])[1]"))).getText();
		
		System.out.println("written text is "+text1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		String text2 = driver.findElement(By.xpath(("(//h1[contains(text(),'This is a sample')])[1]"))).getText();
		
		System.out.println("2nd one is "+text2);
		
		
	}
	

}

