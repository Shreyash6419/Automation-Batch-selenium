package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingFuncation {

	
		
		public static void scrollintoView(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView()", element);
			
		}
		
			

}
