package net.kang.singleton.singleton03_thread;

import net.kang.singleton.single_object.Singleton03;

public class SecondaryThread extends Thread{
    @Override
    public void run(){
        System.out.println("[Thread-2] 두 번째 Thread Testing");
        Singleton03 singleton03 = Singleton03.getInstance();
    }
}
