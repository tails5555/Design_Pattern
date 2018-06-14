package net.kang.singleton.client;

import net.kang.singleton.singleton04_thread.PrimaryThread;
import net.kang.singleton.singleton04_thread.SecondaryThread;
import net.kang.singleton.singleton04_thread.TertiaryThread;

public class MainClient04 {
    public static void main(String[] args){
        System.out.println("[Multi-Thread Singleton Test 03]");
        PrimaryThread primaryThread = new PrimaryThread();
        SecondaryThread secondaryThread = new SecondaryThread();
        TertiaryThread tertiaryThread = new TertiaryThread();

        primaryThread.start();
        secondaryThread.start();
        tertiaryThread.start();

        try {
            primaryThread.join();
            secondaryThread.join();
            tertiaryThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
