package com.ryanchapin.example;

import java.util.Arrays;

public class App implements Runnable {

  private final String[] args;

  public App(String[] args) {
    this.args = args;
  }

  private void doSomething() {
    for (String arg : this.args) {
      System.out.printf("arg=%s%n", arg);
    }
  }

  public static int add(int x, int y) {
    return x + y;
  }

  @Override
  public void run() {
    System.out.printf("run; args=%s%n", Arrays.toString(this.args));
    System.out.println("sleeping...");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
      throw new RuntimeException("boom!");
    }

    doSomething();
  }

}
