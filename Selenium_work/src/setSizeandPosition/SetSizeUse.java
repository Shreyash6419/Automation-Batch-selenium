package setSizeandPosition;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		driver.get("https://paytm.com/");
		
		Dimension defaultsize = driver.manage().window().getSize();
		
		System.out.println("default size of webpage :"+defaultsize);
		
		Dimension d = new Dimension(3000,150);
		
		Thread.sleep(1000);
		
		driver.manage().window().setSize(d);
		
		Dimension currentsize = driver.manage().window().getSize();
		
		System.out.println("default size of webpage :"+currentsize);
		
		
		
		

	}

}
