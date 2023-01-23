package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.manage().window().maximize(); 
		
		Thread.sleep(1000);
		
		WebElement path = driver.findElement(By.xpath("//div[contains(text(),'Build Long-term ')]"));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("arguments[0].scrollIntoView()", path);
		
		ScrollingFuncation.scrollintoView(driver, path);

	}

}
