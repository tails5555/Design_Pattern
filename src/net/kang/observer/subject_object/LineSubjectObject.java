package net.kang.observer.subject_object;

import net.kang.observer.enumeration.SubwayStatus;
import net.kang.observer.observer_inferface.SubwayObserver;
import net.kang.observer.subject_inferface.LineSubject;

import java.util.ArrayList;
import java.util.List;

public class LineSubjectObject implements LineSubject {
    private String lineName;
    private SubwayStatus status;
    private List<SubwayObserver> subwayList;

    public LineSubjectObject(String lineName){
        this.lineName = lineName;
        this.status = null;
        subwayList = new ArrayList<SubwayObserver>();
    }

    @Override
    public void add(SubwayObserver so) {
        this.subwayList.add(so);
    }

    @Override
    public void remove(SubwayObserver so) {
        if(this.subwayList.contains(so)){
            this.subwayList.remove(so);
        }
    }

    @Override
    public void getStatusInfo(SubwayStatus status) {
        this.status = status;
        this.statusInfoPrint();
    }

    @Override
    public void setStatusChange(SubwayStatus status, int person){
        this.status = status;
        this.statusChangePrint(person);
    }

    public void statusInfoPrint(){
        for(SubwayObserver so : this.subwayList){
            System.out.println(so.statusCount(this.status));
        }
    }

    public void statusChangePrint(int person){
        for(SubwayObserver so : this.subwayList){
            System.out.println(so.statusChange(this.status, person));
        }
    }
}
