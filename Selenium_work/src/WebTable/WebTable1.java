package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println("Total Rows present in Table :"+rows.size());
		
		List<WebElement> coln = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		
		System.out.println("no of column present in Table :"+coln.size());
		
		
		//List<WebElement> dataAll = driver.findElements(By.xpath("//table[@id='product']//tr//td"));
		
		for(WebElement as:rows)
		{
			
			System.out.println(as.getText());
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		

	}

}
