package net.kang.java8_observer.subject;

import net.kang.java8_observer.dto.News;

import java.util.List;
import java.util.Observable;

public class BroadcastSubject extends Observable {
    private List<News> news;
    public BroadcastSubject(List<News> news){
        this.news = news;
    }
    public void startBroadcasting(){
        for(News n: news){
            setChanged();
            notifyObservers(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
    }
}
