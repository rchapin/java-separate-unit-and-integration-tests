package com.ryanchapin.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AppTest {

  @Test
  public void testDoSomething() {
    System.out.println("Unit testing doSomething");
    assertTrue(true);
  }

  private static Stream<Arguments> testAddArgs() {
    return Stream.of(Arguments.arguments(1, 2, 3), Arguments.arguments(1, 2, 3),
        Arguments.arguments(1, 2, 3));

  }

  @ParameterizedTest
  @MethodSource("testAddArgs")
  public void testAdd(int inputX, int inputY, int expected) {
    System.out.println("Unit testing add");
    int actual = App.add(inputX, inputY);
    assertEquals(expected, actual);
  }
}
