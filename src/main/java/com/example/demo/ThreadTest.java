package com.example.demo;

import javax.servlet.http.HttpUtils;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Threads extends Thread{
    private static int num = 10;
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        while (num>0){
            if(num>0) {
                System.out.println(getName() + " "+num--);
            }
        }
        lock.unlock();
    }
}
public class ThreadTest {

    public static void main(String[] args) {
        Threads t1 = new Threads();
        Threads t2 = new Threads();

        t2.start();
        t1.start();


    }


}
