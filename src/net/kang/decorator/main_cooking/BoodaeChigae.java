package net.kang.decorator.main_cooking;

public abstract class BoodaeChigae {
    protected final String DISH_NAME = "부대찌개"; // 메인 요리 이름은 변경 없이 부대 찌개.
    protected final int DEFAULT_VOLUME = 500; // 1인당 육수는 500cc 제공한다.
    protected String brothType; // 육수 종류는 멸치 육수, 사골 육수, 야채 육수 등을 넣을 수 있다.

    protected BoodaeChigae(String brothType){
        this.brothType = brothType;
    }

    public abstract void brothInformation();
}
