package Popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		//to get ID of main Page use getWidnowHandle
		
		String mainpageID = driver.getWindowHandle();
		
		// to open new tab window click on main page 
		
		driver.findElement(By.name("NewWindow")).click();
		
		//now main page along with child /new window will be availble 
		
		//to get all page ID's use getwindowhandles()
		
		Set<String> pageID = driver.getWindowHandles();
		
		
		//for(String Y1:pageID)
		//{
		//	System.out.println(Y1);
		//}
		
		Iterator<String> It1 = pageID.iterator();
		
		String mID=It1.next();
		String childID=It1.next();
		
		System.out.println(mID);
		System.out.println(childID);
		
		
		driver.switchTo().window(childID);// switching selenium focus from main page to child page
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
