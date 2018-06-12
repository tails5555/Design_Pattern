package net.kang.decorator.sub_ingredient;

import net.kang.decorator.enumeration.MenuPrice;
import net.kang.decorator.main_cooking.BoodaeChigae;

public class RamenPlusBoodaeChigae extends ChigaeDecorator{
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public RamenPlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        super();
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public String getDescription(){
        return String.format("%s, 라면 사리 %d장 추가", boodaeChigae.getDescription(), this.quantity);
    }

    @Override
    public int cost(){
        return boodaeChigae.cost() + MenuPrice.RAMEN.getValue() * this.quantity;
    }
}
