package TESTNG;

import org.testng.annotations.Test;

public class NewTest123 
{
  @Test(priority = 0,invocationCount = 10,description = "first method")
  public void f() 
  {
	  System.out.println("i am f method");
  }
  @Test(priority = -6,timeOut = 1)
  public void z()
  {
	  System.out.println("i am last alphabet");
  }
  @Test(priority = -5,enabled = true,dependsOnMethods = "z")
  public void A()
  {
	System.out.println("i hope first to come");
  }
  @Test
  public void m()
  {
	  System.out.println("i am a tester");
  }
}
