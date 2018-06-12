package net.kang.decorator.sub_ingredient;

import net.kang.decorator.main_cooking.BoodaeChigae;

public class SpamSausagePlusBoodaeChigae extends ChigaeDecorator {
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public SpamSausagePlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public void brothInformation(){
        this.boodaeChigae.brothInformation();
    }

    @Override
    public void addIngredientInfo(){
        System.out.printf("%s 육수 부대찌개에 스팜/소시지 %d인분 추가\n", this.boodaeChigae.getBrothType(), this.quantity);
    }
}
