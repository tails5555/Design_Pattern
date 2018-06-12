package net.kang.decorator.main_cooking;

public abstract class BoodaeChigae {
    protected final int DEFAULT_VOLUME = 500; // 1인당 육수는 500cc 제공한다.
    protected String brothType; // 육수 종류는 멸치 육수, 사골 육수, 야채 육수 등을 넣을 수 있다.

    public void setBrothType(String brothType){
        this.brothType = brothType;
    }

    public String getBrothType(){
        return this.brothType;
    }

    public abstract void brothInformation();
}
