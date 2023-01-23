package DynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Honda");
		
		Thread.sleep(1000);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s:searchResult)
		{
			System.out.println(s.getText());
			
			String text = "honda unicorn";
			
			if(text.equals(s.getText()))
			{
				s.click();
				break;
			}
			
			
			//driver.findElement(By.xpath("(//a[@class='zDN4ab JNHcG'])[1]")).click();
		}
		
		
		
	}

}
