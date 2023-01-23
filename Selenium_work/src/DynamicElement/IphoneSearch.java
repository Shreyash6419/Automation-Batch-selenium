package DynamicElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("q")).sendKeys("apple iphone 14");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> serch2 = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s1:serch2)
		{
			System.out.println(s1.getText());
			
			String text1 = "apple iphone 14 price";
			
			if(text1.equals(s1.getText()))
					{
						s1.click();
						break;
					}
				
		}
		

	}

}
