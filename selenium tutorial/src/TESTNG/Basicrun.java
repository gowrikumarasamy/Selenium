package TESTNG;

import org.testng.annotations.Test;

public class Basicrun
{
  @Test
  public void f()
  {
	  System.out.println("i am f method");
  }
  @Test
  public void F()
  {
	  System.out.println("hope to be run first");
  }
  @Test
  public void c()
  {
	  System.out.println("print me in alphabetic order");
  }
  @Test(priority = 0)
  public void z()
  {
	  System.out.println("run me first compiler");
  }
 
  
}
