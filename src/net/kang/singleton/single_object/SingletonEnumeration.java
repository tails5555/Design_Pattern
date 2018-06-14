package net.kang.singleton.single_object;

public enum SingletonEnumeration {
    INSTANCE;
    public static SingletonEnumeration getInstance(){
        System.out.println("[SingletonEnumeration] 객체가 생성되었습니다.");
        return INSTANCE;
    }
}
