package FindElementsUse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofLinksonpage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dmart.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.id("pincodeInput")).sendKeys("kolhapur");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div/ul[contains(@class,'src-client-components-pincode-')]/li"));
		
		for(WebElement k1:list1)
		{
			System.out.println(k1.getText());
//			
			String kop1 ="416004 - Shivaji University , Kolhapur";
			
			if(kop1.equals(k1.getText()))
			{
				k1.click();
				break;
			}
			
		}
		
		
		driver.findElement(By.xpath("//button[text()='START SHOPPING']")).click();
		
//		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
		List<WebElement> list2 = driver.findElements(By.tagName("a"));
		
		for(WebElement k2:list2)
		{
			
			System.out.println(k2.getText());
			
		}
		
		
		
		
		
		

	}

}
