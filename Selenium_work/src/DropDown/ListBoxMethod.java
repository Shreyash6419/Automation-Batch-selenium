package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxMethod {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.discoveryplus.in/");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		// Identify listbox element and store it into reference variable 
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		
		// by using one of the select class methods we can select value from list box 
		
		//SelectByVisiableText : SelectByVisiableText(String arg())
		//SelectByVisiableIndex : SelectByVisiableIndex(Int arg()
		//SelectByVisiableValue : SelectByVisiableValue(String arg())
		
		
		s.selectByValue("option3");
		
		Thread.sleep(1000);
		
		s.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
