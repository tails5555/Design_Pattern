package net.kang.bridge.client;

import net.kang.bridge.abstract_class.AccentSingLive;
import net.kang.bridge.singer_object.AccentFemaleSinger;
import net.kang.bridge.singer_object.AccentMaleSinger;
import net.kang.bridge.singer_object.GeneralFemaleSinger;
import net.kang.bridge.singer_object.GeneralMaleSinger;

public class MainClient {
    public static void main(String[] args){
        System.out.println("[일반 가수 라이브]");
        GeneralMaleSinger maleSinger = new GeneralMaleSinger("가수A");
        GeneralFemaleSinger femaleSinger = new GeneralFemaleSinger("가수B");

        maleSinger.sayHello("안녕하세요? 힙합을 잘 하는 가수A 입니다.");
        maleSinger.singing("췍, 요우, 췍. 암더 코리안, 탑 클래스 힙합 모범 쀄브러스~");
        femaleSinger.sayHello("음악을 좋아하는 가수 B입니다.");
        femaleSinger.singing("날 울리지 마요~ 날 사랑해 줘요~");

        System.out.println("[독창 가수 라이브]");
        AccentSingLive accentMaleSinger = new AccentMaleSinger(maleSinger, "갑자기 억양 살린 가수A");
        AccentSingLive accentFemaleSinger = new AccentFemaleSinger(femaleSinger, "갑자기 억양 살린 가수B");

        accentMaleSinger.generalLive("안녕하세요, 가수 A입니다.", "이제 너에게~ 난 아픔이었다는걸~");
        accentFemaleSinger.generalLive("안녕하세요, 가수 B입니다.", "그대 기억이~ 지난 사랑이~");
        accentMaleSinger.changeGenre("힙합");
        accentFemaleSinger.changeGenre("댄스");
        accentMaleSinger.noBgmSinging("Turn Up 늘 분위기는 살리고, 서울에서 World Wide 모두 다 난리도~");
        accentFemaleSinger.noBgmSinging("그대에게 전해주오~ 기다리고 있다고~");
    }
}
