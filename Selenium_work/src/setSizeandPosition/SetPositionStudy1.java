package setSizeandPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Point p1 = driver.manage().window().getPosition();
		
		System.out.println("original position:"+p1);
		
		Point p2 = new Point(200, 500);
		
		driver.manage().window().setPosition(p2);
		
		Point p3 = driver.manage().window().getPosition();
		
		System.out.println("new shifted posion:"+p3);
		

	}

}
