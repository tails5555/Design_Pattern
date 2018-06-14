package net.kang.singleton.single_object;

public class Singleton02 {
    private static Singleton02 uniqueInstance;

    private Singleton02(){
        System.out.println("[Singleton02] 객체가 생성되었습니다.");
    }

    public static synchronized Singleton02 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton02();
        }else{
            System.out.println("[Singleton02] 객체가 이미 존재합니다.");
        }
        return uniqueInstance;
    }
}
