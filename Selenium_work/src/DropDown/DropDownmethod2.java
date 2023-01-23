 package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownmethod2 {

	//private static final boolean Object = false;

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("https://www.discoveryplus.in/");
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
			
			Thread.sleep(5000);
			
			WebElement drop1 = driver.findElement(By.id("day"));
			
			Select sday = new Select(drop1);
			
			sday.selectByIndex(7);
			
			WebElement drop2 = driver.findElement(By.id("month"));
			
			Select Smonth = new Select(drop2);
			
			Smonth.selectByVisibleText("Feb");
			
			System.out.println(Smonth.isMultiple());
			
			WebElement Drop3 = driver.findElement(By.id("year"));
			
			Select Syear = new Select(Drop3);
			
			Syear.selectByValue("1989");
			
			
			List<WebElement> list = Smonth.getOptions();
			
			for(WebElement w1:list)
				
			{
				System.out.println(w1.getText());
			}
			
			
			Iterator<WebElement> s1 = list.iterator();
			
			while(s1.hasNext())
			{
				System.out.println(s1.next().getText());
			}
			
			
			System.out.println("=================================");
			
			
			for(int i=0;i<=list.size()-1;i++)
			{
				System.out.println(list.get(i).getText());
			}
			
			
			
			
			
			
			
			

	}

}
