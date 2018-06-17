package net.kang.observer.subject_inferface;

import net.kang.observer.enumeration.SubwayStatus;
import net.kang.observer.observer_inferface.SubwayObserver;

public interface LineSubject {
    public void add(SubwayObserver so);
    public void remove(SubwayObserver so);
    public void getStatusInfo(SubwayStatus status);
    public void setStatusChange(SubwayStatus status, int person);
}
