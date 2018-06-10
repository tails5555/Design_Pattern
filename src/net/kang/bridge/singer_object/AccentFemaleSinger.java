package net.kang.bridge.singer_object;

import net.kang.bridge.abstract_class.AccentSingLive;
import net.kang.bridge.abstract_interface.SingLive;

public class AccentFemaleSinger extends AccentSingLive {
    private String name;
    public AccentFemaleSinger(SingLive singLive, String name){
        super(singLive);
        this.name = name;
    }
    @Override
    public void changeGenre(String genre){
        System.out.printf("<독창 여자 가수 장르 변경> [%s] %s\n", name, genre);
    }
    @Override
    public void noBgmSinging(String lyrics){
        System.out.printf("<독창 여자 가수 무반주 라이브> [%s] %s\n", name, lyrics);
    }
}
