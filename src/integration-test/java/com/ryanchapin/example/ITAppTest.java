package com.ryanchapin.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ITAppTest {

  @Before
  public void setup() {
    System.out.println("From integration test setup");
    int count = 0;
    for (int i = 0; i < 10; i++) {
      count += i;
      System.out.println("count=" + count);
    }
  }

  @Test
  public void testITApp() {
    System.out.printf("From the integration tests");
    assertTrue(true);
  }
}
