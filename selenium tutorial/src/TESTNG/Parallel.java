package TESTNG;

import org.testng.annotations.Test;

public class Parallel {

	@Test
	public void m1()
	{
		System.out.println("This is test method m1 :: "+Thread.currentThread().getId());
	}
	
	@Test
	public void m2()
	{
		System.out.println("This is test method m2 :: "+Thread.currentThread().getId());
	}
	
	@Test
	public void m3()
	{
		System.out.println("This is test method m3 :: "+Thread.currentThread().getId());
	}
	
	@Test
	public void m4()
	{
		System.out.println("This is test method m4 :: "+Thread.currentThread().getId());
	}
	
	@Test
	public void m5()
	{
		System.out.println("This is test method m5 :: "+Thread.currentThread().getId());
	}
}
