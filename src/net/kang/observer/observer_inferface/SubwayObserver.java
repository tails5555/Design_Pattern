package net.kang.observer.observer_inferface;

import net.kang.observer.enumeration.SubwayStatus;

public interface SubwayObserver {
    public String getSubwayInfo();
    public String statusChange(SubwayStatus status, int personCount);
    public String statusCount(SubwayStatus status);
}
