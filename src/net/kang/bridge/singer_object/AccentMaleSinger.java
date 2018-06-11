package net.kang.bridge.singer_object;

import net.kang.bridge.abstract_class.AccentSingLive;
import net.kang.bridge.abstract_interface.SingLive;

public class AccentMaleSinger extends AccentSingLive {
    private String name;
    public AccentMaleSinger(SingLive singLive, String name){
        super(singLive);
        this.name = name;
    }

    @Override
    public void generalLive(String greeting, String lyrics){
        this.singLive.sayHello(greeting);
        this.singLive.singing(lyrics);
    }

    @Override
    public void changeGenre(String genre){
        System.out.printf("<독창 남자 가수 장르 변경> [%s] %s\n", name, genre);
    }

    @Override
    public void noBgmSinging(String lyrics){
        System.out.printf("<독창 남자 가수 무반주 라이브> [%s] %s\n", name, lyrics);
    }
}
