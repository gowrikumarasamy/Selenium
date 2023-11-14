package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations 
{
  @Test
  public void f() 
  {
	  System.out.println("i am @Test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("i am beforemethod");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("i am aftermethod");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("i am beforeclass");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("i am afterClass");
  }
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("i am beforetest");
  }
  @AfterTest
  public void afterTest()
  {
	  System.out.println("i am aftertest");
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("i am beforesuite");
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("i am aftersuite");
  }
  
  
}
