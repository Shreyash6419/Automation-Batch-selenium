package DropDown;

import java.util.List;
import java.util.TreeSet;

import org.apache.commons.collections4.list.TreeList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownorderEg3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		
		WebElement smonth = driver.findElement(By.id("month"));
		
		Select seq1 = new Select(smonth);
		
		List<WebElement> q1 = seq1.getOptions();
		
		TreeSet<String> tr1 = new TreeSet<String>();
		
		
		for(WebElement sq1:q1)
		{
			System.out.println(sq1.getText());
			String sq2=sq1.getText();
			
			tr1.add(sq2);
		}
		System.out.println("====================================================");
		
		for( String tr2:tr1)
		{
			System.out.println(tr2);
		}

	}

}
