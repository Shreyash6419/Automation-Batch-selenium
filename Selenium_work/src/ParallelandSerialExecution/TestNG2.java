package ParallelandSerialExecution;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG2 {
	 @Test
	  public void SetSize() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			 
			
			driver.get("https://www.phonepe.com/");
			
			Dimension defaultsize = driver.manage().window().getSize();
			
			System.out.println("default size of webpage :"+defaultsize);
			
			Dimension d = new Dimension(3000,150);
			
			Thread.sleep(1000);
			
			driver.manage().window().setSize(d);
			
			Dimension currentsize = driver.manage().window().getSize();
			
			System.out.println("default size of webpage :"+currentsize);
	  }
}
