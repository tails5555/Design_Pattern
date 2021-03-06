package net.kang.java8_observer.observer;

import java.util.Observable;
import java.util.Observer;

public class MaleViewerObject implements Observer {
    private String name;
    public MaleViewerObject(String name){
        this.name = name;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(String.format("남자 시청자 %s 님이 다음 뉴스를 보고 있습니다. : %s", this.name, arg.toString()));
    }
}
