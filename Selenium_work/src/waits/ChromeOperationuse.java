package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOperationuse {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);  
		
		driver.manage().window().maximize();
		
		driver.get("https://www.justdial.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.id("hotkeys_text_1")).click();
		
		
		
		

	}

}
