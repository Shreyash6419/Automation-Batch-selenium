package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert_Equals {
  @Test
  public void TC1() 
  {
	  String a = "Pune";
	  String b = "Pune1";
	  
	  //varify A and B is equal or not
	  //If A and B equal then TC is Passed n if not equal then TC is failed 
	  
	 // if(a.equals(b))
	  //{
		  //Reporter.log("A and B are matching TC is passed", true);
	 // }
	  
	  //else
	  //{
		 // Reporter.log("A and B are not matching TC is failed ", true);
	  //}
	  
	  // using Hard assert using static methods of assert class
	  
	  
	  // assertEquals() when we want compare 2 things 
	  
	  Assert.assertEquals(a,b,"A and B are not Matching TC case Failed ");
	  
	 
	  
	  
  }
}
