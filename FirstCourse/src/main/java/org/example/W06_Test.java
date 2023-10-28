package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class W06_Test {
  @Test
  public void testAdd(){
    W06_Calculator calculator=new W06_Calculator();
    int result=calculator.add(3,4);
    assertEquals(7,result);
  }

  @Test
  public void testSubtract(){
    W06_Calculator calculator=new W06_Calculator();
    int result=calculator.subtract(8,4);
    assertEquals(4,result);
  }

  @Test
  public void testMultiply(){
    W06_Calculator calculator=new W06_Calculator();
    int result=calculator.multiply(3,4);
    assertEquals(12,result);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivide(){
    W06_Calculator calculator=new W06_Calculator();
    int result=calculator.divide(3,0);
  }

}
