package net.kang.singleton.single_object;

public class Singleton01 {
    private static Singleton01 uniqueInstance;

    private Singleton01(){
        System.out.println("[Singleton01] 객체가 생성되었습니다.");
    }

    public static Singleton01 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton01();
        }else{
            System.out.println("[Singleton01] 객체가 이미 존재합니다.");
        }
        return uniqueInstance;
    }
}
