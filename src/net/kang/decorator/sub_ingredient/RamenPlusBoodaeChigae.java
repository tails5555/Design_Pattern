package net.kang.decorator.sub_ingredient;

import net.kang.decorator.main_cooking.BoodaeChigae;

public class RamenPlusBoodaeChigae extends ChigaeDecorator{
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public RamenPlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public void brothInformation(){
        this.boodaeChigae.brothInformation();
    }

    @Override
    public void addIngredientInfo(){
        System.out.printf("%s 육수 부대찌개에 라면 %d장 추가\n", this.boodaeChigae.getBrothType(), this.quantity);
    }
}
