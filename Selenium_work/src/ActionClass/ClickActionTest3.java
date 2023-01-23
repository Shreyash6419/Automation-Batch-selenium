package ActionClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActionTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		WebElement sr1 = driver.findElement(By.xpath("//input[@value='Radio3']"));
		
		Actions t1 = new Actions(driver);
		
		
		t1.moveToElement(sr1).click().build().perform();
		
		

	}

}
