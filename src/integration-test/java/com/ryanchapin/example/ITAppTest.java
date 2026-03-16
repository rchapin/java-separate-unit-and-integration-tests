package com.ryanchapin.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ITAppTest {

  @BeforeAll
  public static void setup() {
    System.out.println("From integration one-time test setup");
  }

  @Test
  public void testITApp() throws Exception {
    System.out.printf("From the integration tests");

    App app = new App(new String[] {"arg1", "val1", "arg2", "val2"});
    Thread vThread = Thread.ofVirtual().name("app-int-test-thread").start(app);
    vThread.join();
    assertTrue(true);
  }
}
