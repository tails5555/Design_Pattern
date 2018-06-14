package net.kang.singleton.single_object;

public class Singleton03 {
    private static Singleton03 uniqueInstance = new Singleton03();

    private Singleton03(){
        System.out.println("[Singleton03] 객체가 생성되었습니다.");
    }

    public static synchronized Singleton03 getInstance(){
        if(uniqueInstance != null){
            System.out.println("[Singleton03] 객체가 이미 존재합니다.");
        }
        return uniqueInstance;
    }
}
