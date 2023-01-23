package Selenium_Study;

import java.awt.geom.Dimension2D;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Method2 {

	public static void main(String[] args) throws InterruptedException {
		
		
        //System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.flipkart.com/");

		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
        
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Dimension dd = new Dimension(1500,890);
		
		driver.manage().window().setSize(dd);
		
		
		System.out.println(driver.manage().window().getSize());
		
		//Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
		//Thread.sleep(1000);
		
		//driver.manage().window().minimize();
		
		//driver.navigate().to("https://www.redbus.in/");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();
		
		//driver.quit();
		
		
		//String geturl = driver.getCurrentUrl();
		
		//System.out.println(geturl);
		
		//driver.close();
		
		//String gettitle =driver.getTitle();
		
		//System.out.println(gettitle);
		
		
	}

	private static Dimension Dimension(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
