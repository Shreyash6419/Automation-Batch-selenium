package setSizeandPosition;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Wiki");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Point r1 = driver.manage().window().getPosition();
		
		System.out.println("original position:"+r1);
		
		Point r2 = new Point(300, 500);
		
		driver.manage().window().setPosition(r2);
		
		Point r3 = driver.manage().window().getPosition();
		
		System.out.println("shifted position is :"+r3);

	}

}
