package net.kang.singleton.singleton03_thread;

import net.kang.singleton.single_object.Singleton03;

public class PrimaryThread extends Thread {
    @Override
    public void run(){
        System.out.println("[Thread-1] 첫 번째 Thread Testing");
        Singleton03 singleton03 = Singleton03.getInstance();
    }
}
