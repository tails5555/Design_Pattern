package net.kang.observer.observer_object;

import net.kang.observer.enumeration.SubwayStatus;
import net.kang.observer.observer_inferface.SubwayInterface;
import net.kang.observer.observer_inferface.SubwayObserver;
import net.kang.observer.subject_inferface.LineSubject;

// 보통역 구현 객체. 보통역이 2번째인데 여기서는 간이배치역도 보통역에 해당된다고 가정하자.
public class GeneralSubwayObject implements SubwayObserver, SubwayInterface {
    private boolean hasTransfer;
    private String subwayName;
    private int rideCount;
    private int transferCount;
    private int quitCount;

    public GeneralSubwayObject(LineSubject lineSubject, String subwayName, boolean hasTransfer){
        this.setSubwayName(subwayName);
        this.setHasTransfer(hasTransfer);
        this.setRideCount(0);
        if(this.getHasTransfer()){
            this.setTransferCount(0);
        }else{ // 만일 환승역이 아니면, 이 변수는 음수로 체킹하여 안 이용한다.
            this.setTransferCount(Integer.MIN_VALUE);
        }
        this.setQuitCount(0);
        lineSubject.add(this);
    }

    @Override
    public String getSubwayInfo() {
        return String.format("[보통역] %s%s", this.getSubwayName(), (this.getHasTransfer()) ? "[환승]" : "");
    }

    @Override
    public String statusChange(SubwayStatus status, int personCount) {
        switch(status){
            case RIDE :
                this.setRideCount(this.getRideCount() + personCount);
                return String.format("%s - %d명 승차합니다.", this.getSubwayInfo(), personCount);
            case TRANSFER :
                if(this.getHasTransfer()) {
                    this.setTransferCount(this.getTransferCount() + personCount);
                    return String.format("%s - %d명 환승합니다.", this.getSubwayInfo(), personCount);
                }
                else {
                    return String.format("%s - 환승역이 아닙니다.", this.getSubwayInfo());
                }
            case QUIT :
                this.setQuitCount(this.getQuitCount() + personCount);
                return String.format("%s - %d명 하차합니다.", this.getSubwayInfo(), personCount);
        }
        return null;
    }

    @Override
    public String statusCount(SubwayStatus status) {
        switch(status){
            case RIDE :
                return String.format("%s - 현재까지 %d명 승차했습니다.", this.getSubwayInfo(), this.getRideCount());
            case TRANSFER :
                if(this.getHasTransfer()) {
                    return String.format("%s - 현재까지 %d명 환승했습니다.", this.getSubwayInfo(), this.getTransferCount());
                }else{
                    return String.format("%s - 환승역이 아닙니다.", this.getSubwayInfo());
                }
            case QUIT :
                return String.format("%s - 현재까지 %d명 하차했습니다.", this.getSubwayInfo(), this.getQuitCount());
        }
        return null;
    }

    @Override
    public void setSubwayName(String subwayName){
        this.subwayName = subwayName;
    }

    @Override
    public void setHasTransfer(boolean hasTransfer){
        this.hasTransfer = hasTransfer;
    }

    @Override
    public void setRideCount(int personCount) {
        this.rideCount = personCount;
    }

    @Override
    public void setTransferCount(int personCount) {
        this.transferCount = personCount;
    }

    @Override
    public void setQuitCount(int personCount) {
        this.quitCount = personCount;
    }

    @Override
    public String getSubwayName(){
        return this.subwayName;
    }

    @Override
    public boolean getHasTransfer(){
        return this.hasTransfer;
    }

    @Override
    public int getRideCount() {
        return this.rideCount;
    }

    @Override
    public int getQuitCount() {
        return this.quitCount;
    }

    @Override
    public int getTransferCount() {
        return this.transferCount;
    }
}
