package TESTNG;

import org.testng.annotations.Test;

public class Seconddemo 
{
  @Test(priority = 0)
  public void f() 
  {
	  System.out.println("i am your f method");
  }
  @Test(priority = -1)
  public void a()
  {
	System.out.println("i am a method");  
  }
  @Test
  public void v()
  {
	  System.out.println("i am v method");
  }
  @Test(priority = 1)
  public void m()
  {
	  System.out.println("i am m method");
  }
  @Test(priority = 2)
  public void s()
  {
	  System.out.println("i am s method");
  }
  
  @Test(enabled = false)
  public void j()
  {
	  System.out.println("i am j method");
  }
  
  
}
