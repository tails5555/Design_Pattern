package net.kang.decorator.main_cooking;

// 멸치 육수 부대 찌개 객체 생성
public class FishBrothBoodaeChigae extends BoodaeChigae {
    private int person;
    public FishBrothBoodaeChigae(int person){
        this.person = person;
        this.setBrothType("멸치");
        System.out.printf("[주문] 멸치 육수 부대찌개 %d인분 주문했습니다.\n", person);
    }
    @Override
    public void brothInformation(){
        System.out.printf("부대찌개 %d인분 - %s 육수 %d cc\n", person, this.brothType, this.person * this.DEFAULT_VOLUME);
    }
}
