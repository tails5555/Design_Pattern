package net.kang.decorator.sub_ingredient;

import net.kang.decorator.enumeration.MenuPrice;
import net.kang.decorator.main_cooking.BoodaeChigae;

public class RedBeanPlusBoodaeChigae extends ChigaeDecorator {
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public RedBeanPlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        super();
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public String getDescription(){
        return String.format("%s, 통조림 콩 %d인분 추가", boodaeChigae.getDescription(), this.quantity);
    }

    @Override
    public int cost(){
        return boodaeChigae.cost() + MenuPrice.RED_BEAN.getValue() * this.quantity;
    }
}
