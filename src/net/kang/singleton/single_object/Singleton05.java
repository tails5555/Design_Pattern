package net.kang.singleton.single_object;

public class Singleton05 {
    private Singleton05(){
        System.out.println("[Singleton05] 객체가 생성되었습니다.");
    }

    private static class LazyHolder{
        static final Singleton05 INSTANCE = new Singleton05();
    }

    public static Singleton05 getInstance(){
        return LazyHolder.INSTANCE;
    }
}
