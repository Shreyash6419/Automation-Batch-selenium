package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test
  public void GoogleTest() 
  {
	  Reporter.log("test pass under google test", true);
  }
  
  @Test
  public void RediffMailTest() 
  {
	  Reporter.log("test pass under RediffWeb test", true);
  }
  @BeforeMethod
  public void launchBrowser() 
  {
	  Reporter.log("Browser launched-- Before Method executed", true);
	 
  }

  @AfterMethod
  public void CloseBrower() 
  {
	  Reporter.log("Browser closed--After Method executed", true);
  }

//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }

}
