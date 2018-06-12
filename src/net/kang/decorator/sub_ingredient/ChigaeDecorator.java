package net.kang.decorator.sub_ingredient;

import net.kang.decorator.main_cooking.BoodaeChigae;

public abstract class ChigaeDecorator extends BoodaeChigae {
    protected BoodaeChigae boodaeChigae;
    protected ChigaeDecorator(String brothType){
        super(brothType);
    }
    public abstract void addIngredientInfo();
}
