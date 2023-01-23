package iframeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		driver.switchTo().frame("frame1");
		
		
		WebElement txt1 = driver.findElement(By.xpath("(//h1[contains(text(),'This is a sample')])[1]"));
		
		System.out.println("screen frame1 display :"+txt1.getText());
		
		driver.switchTo().defaultContent();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
//		WebElement img1 = driver.findElement(By.id("(app)//a/img)[1]"));
//		
//		
//		System.out.println(img1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.switchTo().frame("frame2");
		
		
		WebElement txt2 = driver.findElement(By.xpath("(//h1[contains(text(),'This is a sample')])[1]"));
		
		System.out.println("screen frame2 display :"+txt2.getText());
		
	

	}

}
