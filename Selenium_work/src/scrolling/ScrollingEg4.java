package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingEg4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-Pun&gclid=EAIaIQobChMI_ZLdiP-e_AIVlAVyCh2tAgvZEAAYASAAEgKdbPD_BwE");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		JavascriptExecutor scrl4 = (JavascriptExecutor)driver;
		
		scrl4.executeScript("window.scrollBy(200,5000)");
		
		
		

	}

}
