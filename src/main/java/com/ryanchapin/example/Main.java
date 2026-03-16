package com.ryanchapin.example;

public class Main {

    public static void main(String[] args) throws Exception {
        App app = new App(args);

        Thread vThread = Thread.ofVirtual().name("app-thread").start(app);
        vThread.join();
        System.out.println("main finished....");
    }

}
