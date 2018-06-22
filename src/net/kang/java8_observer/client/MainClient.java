package net.kang.java8_observer.client;

import net.kang.java8_observer.dto.News;
import net.kang.java8_observer.enumeration.NewsStatus;
import net.kang.java8_observer.observer.FemaleViewerObject;
import net.kang.java8_observer.observer.MaleViewerObject;
import net.kang.java8_observer.subject.BroadcastSubject;

import java.util.Arrays;
import java.util.List;
import java.util.Observer;

import static net.kang.java8_observer.enumeration.NewsStatus.GENERAL;
import static net.kang.java8_observer.enumeration.NewsStatus.SPECIAL;

public class MainClient {
    public static void main(String[] args){
        List<News> news = Arrays.asList(new News(GENERAL, "일반뉴스1"), new News(SPECIAL, "특종뉴스1"), new News(GENERAL, "일반뉴스2"), new News(SPECIAL, "특종뉴스2"));
        MaleViewerObject mvo1 = new MaleViewerObject("강감찬");
        MaleViewerObject mvo2 = new MaleViewerObject("홍길동");
        FemaleViewerObject fvo1 = new FemaleViewerObject("성춘향");
        FemaleViewerObject fvo2 = new FemaleViewerObject("신데렐라");

        BroadcastSubject bs = new BroadcastSubject(news);
        bs.addObserver(mvo1);
        bs.addObserver(mvo2);
        bs.addObserver(fvo1);
        bs.addObserver(fvo2);

        bs.startBroadcasting();
    }
}
