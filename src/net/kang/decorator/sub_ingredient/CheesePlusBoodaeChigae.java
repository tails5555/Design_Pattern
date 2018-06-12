package net.kang.decorator.sub_ingredient;

import net.kang.decorator.main_cooking.BoodaeChigae;

// 치즈 추가한 부대찌개 클래스
public class CheesePlusBoodaeChigae extends ChigaeDecorator{
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public CheesePlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public void brothInformation(){
        this.boodaeChigae.brothInformation();
    }

    @Override
    public void addIngredientInfo(){
        System.out.printf("%s 육수 부대찌개에 치즈 %d장 추가\n", this.boodaeChigae.getBrothType(), this.quantity);
    }
}
