package com.altuhin.thread.monitorlokc;

public class MonitorLockExample {
    public synchronized void task1() {
        try {
            System.out.println("Inside task1().");
            Thread.sleep(10000);
            System.out.println("lock release");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void task2() {
        System.out.println("task2(), but before synchronized.");
        synchronized (this){
            System.out.println("task2(). Inside synchronized");
        }
    }
    public void task3() {
        System.out.println("Inside task3()");
    }

    public static void main(String[] args) {
        //I'm creating one object (lockExample) and all threads working on same object.

        MonitorLockExample lockExample = new MonitorLockExample();

        Thread thread1 = new Thread(lockExample::task1);
        Thread thread2 = new Thread(lockExample::task2);
        Thread thread3 = new Thread(lockExample::task3);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
