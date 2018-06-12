package net.kang.decorator.sub_ingredient;

import net.kang.decorator.enumeration.MenuPrice;
import net.kang.decorator.main_cooking.BoodaeChigae;

// 치즈 추가한 부대찌개 클래스
public class CheesePlusBoodaeChigae extends ChigaeDecorator{
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public CheesePlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        super();
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public String getDescription(){
        return String.format("%s, 치즈 %d장 추가", boodaeChigae.getDescription(), this.quantity);
    }

    @Override
    public int cost(){
        return boodaeChigae.cost() + MenuPrice.CHEESE.getValue() * this.quantity;
    }
}
