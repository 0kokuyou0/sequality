package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.Sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.Ave(2, 3), 0);
  }

  @Test
  public void testSumAtoB() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.SumAtoB(1, 10));
  }

  @Test
  public void testAveAtoB() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.AveAtoB(1, 10), 0);
  }

  @Test
  public void OddAtoB() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.OddAtoB(1, 10));
  }

  @Test
  public void EvenAtoB() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.EvenAtoB(1, 10));
  }

}
