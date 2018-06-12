package net.kang.decorator.main_cooking;

// 사골 육수 부대 찌개 객체 생성
public class BoneBrothBoodaeChigae extends BoodaeChigae {
    private int person;
    public BoneBrothBoodaeChigae(int person){
        super("사골");
        this.person = person;
    }
    @Override
    public void brothInformation(){
        System.out.printf("부대찌개 %d인분 - %s 육수 %d cc\n", person, this.brothType, this.person * this.DEFAULT_VOLUME);
    }
}
