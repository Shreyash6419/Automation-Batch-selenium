package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrolling.ScrollingFuncation;
import scrolling.ScrollingtoView2;

public class WebTable3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		
		
		WebElement scroll1 = driver.findElement(By.xpath("//legend[text()='Web Table Example']"));
		
		ScrollingFuncation.scrollintoView(driver, scroll1);
		
		Thread.sleep(1000);
		
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		
		System.out.println(row1.size());
		
		for(WebElement s1:row1)
		{
			
			System.out.println(s1.getText());
		}
		
		System.out.println("====================column========================================");
		
		List<WebElement> colmn1 = driver.findElements(By.xpath("//table[@class='table-display']//tr[2]/td"));
		
		for(WebElement s2:colmn1)
		{
			System.out.println(s2.getText());
			
		}
		
		
		

	}

}
