package DynamicElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver,chrome,driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Maruti");
		
		Thread.sleep(1000);
		
		List<WebElement> search1 = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		for(WebElement s1:search1) {
			
			System.out.println(s1.getText());
			
			String s2="maruti share price";
			
			if(s2.equals(s1.getText()))
			{
				s1.click();
			}
		}
		

	}

}
