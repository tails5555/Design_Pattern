package net.kang.observer.observer_inferface;

public interface SubwayInterface {
    public void setSubwayName(String subwayName);
    public void setHasTransfer(boolean hasTransfer);
    public void setRideCount(int personCount);
    public void setTransferCount(int personCount);
    public void setQuitCount(int personCount);
    public String getSubwayName();
    public boolean getHasTransfer();
    public int getRideCount();
    public int getTransferCount();
    public int getQuitCount();
}
