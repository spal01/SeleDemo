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
	  assertEquals(2, 3);
	  System.out.println("test3");
  }
  
  @Test
  public void test4() {
	  assertEquals(2, 2);
	  System.out.println("test4");
  }
  
  @Test
  public void test5() {
	  assertEquals(2, 2);
	  System.out.println("test5");
  }

}
