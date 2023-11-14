package TESTNG;

import org.testng.annotations.Test;

public class BASIC
{
  @Test
  public void f() 
  {
	 System.out.println("testNG");
  }
  @Test(priority = 1)
  public void F()
  {
	  System.out.println("i am first");
  }
  @Test(priority = 0)
  public void a()
  {
	  System.out.println("i am r method");
  }
  
}
