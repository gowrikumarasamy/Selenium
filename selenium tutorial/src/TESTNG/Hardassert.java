package TESTNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert 
{
  @Test
  public void Test1() 
  {
	  System.out.println("test started");
	  Assert.assertEquals(10, 10);
	  System.out.println("test completed");
   }
  @Test
  
  public void Test2()
  {
	  System.out.println("test started");
	  Assert.assertEquals(10, 18);
	  System.out.println("test completed");
	  
  }
  
}
