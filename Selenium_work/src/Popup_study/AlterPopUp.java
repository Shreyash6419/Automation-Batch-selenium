package Popup_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("timerAlertButton")).click();
			
			Thread.sleep(10000);
			
			Alert alt = driver.switchTo().alert();
			
			System.out.println(alt.getText());
			
			alt.accept();
			
			driver.findElement(By.id("alertButton")).click();
			
			Thread.sleep(500);
			
			Alert alt1 = driver.switchTo().alert();
			
			System.out.println(alt1.getText());
			
			alt1.accept();
			
			
	}

}
