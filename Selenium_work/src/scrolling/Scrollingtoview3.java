package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingtoview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tatamotors.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement ticket1 = driver.findElement(By.xpath("//h3[text()='MEDIA']"));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		ScrollingFuncation.scrollintoView(driver,ticket1);
	}

}
