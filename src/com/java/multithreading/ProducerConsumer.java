package com.java.multithreading;


public class ProducerConsumer {
    public static void main(String[] args) {
        Container container = new Container();
        (new Thread(new Producer(container))).start();
        (new Thread(new Consumer(container))).start();
    }
}