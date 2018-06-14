package net.kang.singleton.singleton03_thread;

import net.kang.singleton.single_object.Singleton03;

public class TertiaryThread extends Thread {
    @Override
    public void run(){
        System.out.println("[Thread-3] 세 번째 Thread Testing");
        Singleton03 singleton03 = Singleton03.getInstance();
    }
}
