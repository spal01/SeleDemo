package SeleAuto;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestSele {
	
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("test2");
  }

  @Test
  public void test3() {
	  assertEquals(3, 2);
	  System.out.println("test3");
  }

}
