package HandleImage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleImage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		WebElement staticImg = driver.findElement(By.xpath("//img[@alt='Velocity']"));
		
		if(staticImg.isDisplayed())
		{
			System.out.println("displayed image");
		}
		
		System.out.println(staticImg.getAttribute("alt"));

	}

}
