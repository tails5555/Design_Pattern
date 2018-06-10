package net.kang.bridge.client;

import net.kang.bridge.abstract_class.AccentSingLive;
import net.kang.bridge.singer_object.AccentFemaleSinger;
import net.kang.bridge.singer_object.AccentMaleSinger;
import net.kang.bridge.singer_object.GeneralFemaleSinger;
import net.kang.bridge.singer_object.GeneralMaleSinger;

public class MainClient {
    public static void main(String[] args){
        GeneralMaleSinger maleSinger = new GeneralMaleSinger("가수A");
        GeneralFemaleSinger femaleSinger = new GeneralFemaleSinger("가수B");

        maleSinger.sayHello("안녕하세요? 힙합을 잘 하는 가수A 입니다.");
        maleSinger.singing("췍, 요우, 췍. 암더 코리안, 탑 클래스 힙합 모범 쀄브러스~");
        femaleSinger.sayHello("음악을 좋아하는 가수 B입니다.");
        femaleSinger.sayHello("날 울리지 마요~ 날 사랑해 줘요~");

        AccentMaleSinger accentMaleSinger = new AccentMaleSinger(maleSinger, "억양 살린 가수A");
        AccentFemaleSinger accentFemaleSinger = new AccentFemaleSinger(femaleSinger, "억양 살린 가수B");

        accentMaleSinger.changeGenre("발라드");
        accentFemaleSinger.changeGenre("댄스");
        accentMaleSinger.noBgmSinging("이 몇 분 짜리 노래가~ 별거 아닌 가사가~");
        accentFemaleSinger.noBgmSinging("그대에게 전해주오~ 기다리고 있다고~");
    }
}
