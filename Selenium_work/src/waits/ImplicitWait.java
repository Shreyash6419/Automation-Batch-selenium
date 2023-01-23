
package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
		driver.navigate().to("https://www.discoveryplus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		

	}

}
