package net.kang.singleton.single_object;

public class Singleton04 {
    private volatile static Singleton04 uniqueInstance;

    private Singleton04(){
        System.out.println("[Singleton04] 객체가 생성되었습니다.");
    }

    public static Singleton04 getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton04.class){
                if(uniqueInstance == null)
                    uniqueInstance = new Singleton04();
            }
        }else{
            System.out.println("[Singleton04] 객체가 이미 존재합니다.");
        }
        return uniqueInstance;
    }
}
