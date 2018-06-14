package net.kang.singleton.singleton04_thread;

import net.kang.singleton.single_object.Singleton03;
import net.kang.singleton.single_object.Singleton04;

public class SecondaryThread extends Thread{
    @Override
    public void run(){
        System.out.println("[Thread-2] 두 번째 Thread Testing");
        Singleton04 singleton04 = Singleton04.getInstance();
    }
}
