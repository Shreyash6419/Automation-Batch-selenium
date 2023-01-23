package ParallelandSerialExecution;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void SetPosition() 
  {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		driver.get("https://paytm.com/");
		
		Point pos1 = driver.manage().window().getPosition();
		
		System.out.println("default position is :"+pos1);
		
		Point pos2 = new Point(200, 250);
		
		driver.manage().window().setPosition(pos2);
		
		Point pos3 = driver.manage().window().getPosition();
		
		System.out.println("current position is :"+pos3);
  }
  
   
 
}
