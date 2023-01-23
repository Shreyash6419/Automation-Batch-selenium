package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		JavascriptExecutor scrl2 = (JavascriptExecutor)driver;
		
		scrl2.executeScript("window.scrollBy(200,3000");
		
		
		
		
	}

}
