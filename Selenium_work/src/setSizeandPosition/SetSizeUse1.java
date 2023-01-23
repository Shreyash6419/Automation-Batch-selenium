package setSizeandPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		
		driver.get("https://paytm.com/");
		
		Dimension defsize = driver.manage().window().getSize();
		
		System.out.println("initial size of webpage:"+defsize);
		
		Dimension d1 = new Dimension(1500, 500);
		
		driver.manage().window().setSize(d1);
		
		Dimension d3 = driver.manage().window().getSize();
		
		System.out.println("shifted size of webpage:"+d3);
		
		

	}

}
