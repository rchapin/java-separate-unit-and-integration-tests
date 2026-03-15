package com.ryanchapin.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

  @Before
  public void setup() {
    System.out.println("From unit test setup");
    int count = 0;
    for (int i = 0; i < 10; i++) {
      count += i;
      System.out.println("count=" + count);
    }
  }

  @Test
  public void testApp() {
    System.out.println("From the unit tests");
    assertTrue(true);
  }
}
