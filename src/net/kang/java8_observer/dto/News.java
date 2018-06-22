package net.kang.java8_observer.dto;

import net.kang.java8_observer.enumeration.NewsStatus;

import static net.kang.java8_observer.enumeration.NewsStatus.SPECIAL;

public class News {
    private NewsStatus newsStatus;
    private String context;
    public News(NewsStatus newsStatus, String context){
        this.newsStatus = newsStatus;
        this.context = context;
    }
    @Override
    public String toString(){
        return String.format("[%s] %s", this.newsStatus == SPECIAL ? "특보" : "일반", this.context);
    }
}
