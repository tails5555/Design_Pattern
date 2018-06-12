package net.kang.decorator.sub_ingredient;

import net.kang.decorator.enumeration.MenuPrice;
import net.kang.decorator.main_cooking.BoodaeChigae;

public class SpamSausagePlusBoodaeChigae extends ChigaeDecorator {
    private BoodaeChigae boodaeChigae;
    private int quantity;

    public SpamSausagePlusBoodaeChigae(BoodaeChigae boodaeChigae, int quantity){
        super();
        this.boodaeChigae = boodaeChigae;
        this.quantity = quantity;
    }

    @Override
    public String getDescription(){
        return String.format("%s, 부대고기 %d인분 추가", boodaeChigae.getDescription(), this.quantity);
    }

    @Override
    public int cost(){
        return boodaeChigae.cost() + MenuPrice.SPAM_SAUSAGE.getValue() * this.quantity;
    }
}
