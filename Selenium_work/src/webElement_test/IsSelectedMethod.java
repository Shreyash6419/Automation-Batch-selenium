package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
	  
		
        System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	    WebElement Select1 = driver.findElement(By.name("checkBoxOption1"));
	    
	    System.out.println(Select1.isSelected());
	    
	    Select1.click();
	    
	    System.out.println(Select1.isSelected());
	    
	    
	    
		
		

	}

}
