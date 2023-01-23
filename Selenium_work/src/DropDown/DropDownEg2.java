package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		

		WebElement smonth = driver.findElement(By.id("month"));
		
		Select s1 = new Select(smonth);
		
	
		List<WebElement> w1 = s1.getOptions();
		
		System.out.println(w1.size());
		
		for(WebElement p1:w1)
		{
			System.out.println(p1.getText());
		}
		
		System.out.println("=========================================");
		
		Iterator<WebElement> p2 = w1.iterator();
		
		while(p2.hasNext())
		{
			System.out.println(p2.next().getText());
		}
		
		
		
		
		
		

	}

}
