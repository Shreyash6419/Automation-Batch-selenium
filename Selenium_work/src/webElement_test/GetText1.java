package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) {
	 
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		driver.manage().window().maximize();
		
		WebElement text1 = driver.findElement(By.xpath("//a[text()='HOME ']"));
		
		
		text1.getText();
		
		System.out.println("text :"+text1.getText());
		
		text1.click();

	}

}
