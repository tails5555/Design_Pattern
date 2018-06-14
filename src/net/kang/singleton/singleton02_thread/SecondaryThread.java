package net.kang.singleton.singleton02_thread;

import net.kang.singleton.single_object.Singleton02;

public class SecondaryThread extends Thread{
    @Override
    public void run(){
        System.out.println("[Thread-2] 두 번째 Thread Testing");
        Singleton02 singleton02 = Singleton02.getInstance();
    }
}
