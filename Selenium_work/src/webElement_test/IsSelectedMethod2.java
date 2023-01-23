package webElement_test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrolling.ScrollingFuncation;

public class IsSelectedMethod2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airtel.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement loc1 = driver.findElement(By.xpath("//h4[text()='Recharge or pay bills']"));
		
		ScrollingFuncation.scrollintoView(driver, loc1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement airtel1 = driver.findElement(By.xpath("(//p[text()='Prepaid'])[1]"));
		
		System.out.println(airtel1.isSelected());
		
		airtel1.click();
		
		System.out.println(airtel1.isSelected());
		
		List<WebElement> col1 = driver.findElements(By.xpath("//div[@class='badge-container']/button"));
		
		System.out.println(col1.size());
		for(WebElement c1:col1)
		{
			System.out.print(c1.getText()+" // ");
			
		}
		
		
		
		

	}

}
