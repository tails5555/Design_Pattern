package net.kang.decorator.sub_ingredient;

// 부대 찌개에 치즈를 추가하였음.
public class CheesePlusBoodaeChigae extends ChigaeDecorator{
    private int person;
    public CheesePlusBoodaeChigae(String brothType, int person){
        super(brothType);
        this.person = person;
    }
    @Override
    public void brothInformation(){
        System.out.printf("부대찌개 %d인분 - %s 육수 %d cc\n", this.person, this.brothType, this.person * this.DEFAULT_VOLUME);
    }
    @Override
    public void addIngredientInfo(){
        System.out.printf("부대찌개 %d인분 - %s 육수 치즈 추가\n", this.person, this.brothType);
    }
}
