package webElement_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		driver.manage().window().maximize();
		
		
		String text = driver.findElement(By.xpath("//h1[contains(text(),'Welcome To Practice Page')]")).getText();
		
		System.out.println("we can see text here"+text);

	}

}
