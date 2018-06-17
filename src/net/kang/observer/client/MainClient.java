package net.kang.observer.client;

import net.kang.observer.observer_inferface.SubwayObserver;
import net.kang.observer.observer_object.BatchSubwayObject;
import net.kang.observer.observer_object.GeneralSubwayObject;
import net.kang.observer.observer_object.ManageSubwayObject;
import net.kang.observer.subject_object.LineSubjectObject;

import static net.kang.observer.enumeration.SubwayStatus.QUIT;
import static net.kang.observer.enumeration.SubwayStatus.RIDE;
import static net.kang.observer.enumeration.SubwayStatus.TRANSFER;

public class MainClient {
    public static void main(String[] args){
        LineSubjectObject metro2 = new LineSubjectObject("2호선");

        SubwayObserver m201 = new ManageSubwayObject(metro2,"시청역", true);
        SubwayObserver m208 = new GeneralSubwayObject(metro2, "왕십리역", true);
        SubwayObserver m211 = new GeneralSubwayObject(metro2, "성수역", false);
        SubwayObserver m214 = new BatchSubwayObject(metro2, "강변역", false);
        SubwayObserver m216 = new GeneralSubwayObject(metro2, "잠실역", true);
        SubwayObserver m218 = new BatchSubwayObject(metro2, "종합운동장역", true);

        System.out.println("[2호선 1000명 승차]");
        metro2.setStatusChange(RIDE, 1000);
        System.out.println();

        System.out.println("[2호선 3000명 하차]");
        metro2.setStatusChange(QUIT, 3000);
        System.out.println();

        System.out.println("[2호선 3000명 승차]");
        metro2.setStatusChange(RIDE, 3000);
        System.out.println();

        System.out.println("[2호선 2000명 환승]");
        metro2.setStatusChange(TRANSFER, 2000);
        System.out.println();

        System.out.println("[2호선 승차 인원 통계]");
        metro2.getStatusInfo(RIDE);
        System.out.println();

        System.out.println("[2호선 하차 인원 통계]");
        metro2.getStatusInfo(QUIT);
        System.out.println();

        System.out.println("[2호선 환승 인원 통계]");
        metro2.getStatusInfo(TRANSFER);
        System.out.println();
    }
}
