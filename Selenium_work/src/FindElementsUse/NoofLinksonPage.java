package FindElementsUse;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinksonPage {

	public static void main(String[] args) throws InterruptedException {
		
		

		    System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("https://www.discoveryplus.in/");
			
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			List<WebElement> list1 = driver.findElements(By.tagName("a"));
			System.out.println(list1.size());
			for(WebElement w:list1)
			{
				System.out.println(w.getText());
			}
			

	}

}
