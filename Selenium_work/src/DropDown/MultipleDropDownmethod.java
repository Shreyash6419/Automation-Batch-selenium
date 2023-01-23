package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDownmethod {

	public static void main(String[] args) throws InterruptedException {
		  
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement typecar = driver.findElement(By.id("cars"));
		
		Select Scar = new Select(typecar);
		
		
		
		Scar.selectByIndex(0);
		Thread.sleep(1000);
		
		Scar.selectByIndex(1);
		Thread.sleep(1000);
		
		Scar.selectByIndex(2);
		Thread.sleep(1000);
		
		
		Scar.selectByIndex(3);
		
		//Scar.deselectAll();
		
		Scar.deselectByIndex(0);
		
		

	}

}
