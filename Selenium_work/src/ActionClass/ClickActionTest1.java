package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActionTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		  
		driver.manage().window().maximize();
		
		
		
		//click by using action class
		// find the element to be handle and store it to the reference varible 
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		// create an object of action class pass driver object as parameter
		
		Actions act = new Actions(driver);
		
		//using one of the action class methods take required action 
		
		//type-1
		//act.moveToElement(radio1).perform();
		//act.click().perform();
		
		//type-2
		
		act.moveToElement(radio1).click().build().perform();
		
		//type-3
		
		
		//act.click(radio1).perform();
		

	}

}
