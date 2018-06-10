package net.kang.bridge.singer_object;

import net.kang.bridge.abstract_interface.SingLive;

public class GeneralFemaleSinger implements SingLive {
    private String name;
    public GeneralFemaleSinger(String name){
        this.name = name;
    }
    @Override
    public void sayHello(String greeting){
        System.out.printf("<일반 여자 가수 인사> [%s] %s\n", name, greeting);
    }
    @Override
    public void singing(String lyrics){
        System.out.printf("<일반 여자 가수 라이브> [%s] %s\n", name, lyrics);
    }
}
