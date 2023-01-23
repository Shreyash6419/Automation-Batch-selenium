package DynamicElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTATAsearch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("TATA");
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div/ul[@class='G43f7e']/li"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		for(WebElement l1:list1)
		{
			System.out.println(l1.getText());
			
			String txt1 = "tata nexon";
			
			if(txt1.equals(l1.getText()))
			{
				l1.click();
				break;
				
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
