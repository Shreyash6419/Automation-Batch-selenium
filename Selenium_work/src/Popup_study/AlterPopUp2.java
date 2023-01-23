package Popup_study;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		
		Thread.sleep(10000);
		
		Alert alr1 = driver.switchTo().alert();
		
		System.out.println(alr1.getText());
		
		alr1.accept();
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(10000);
		
		Alert alr2 = driver.switchTo().alert();
		
		System.out.println(alr2.getText());
		
		alr2.accept();
	

	}

}
