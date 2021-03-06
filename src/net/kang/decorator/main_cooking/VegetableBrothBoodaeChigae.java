package net.kang.decorator.main_cooking;

import net.kang.decorator.enumeration.MenuPrice;

// 야채 육수 부대 찌개 객체 생성
public class VegetableBrothBoodaeChigae extends BoodaeChigae{
    private int person;

    public VegetableBrothBoodaeChigae(int person){
        this.person = person;
        super.setDescription(String.format("야채 육수 부대찌개 %d인분", person));
        System.out.printf("[주문] 야채 육수 부대찌개 %d인분 주문했습니다.\n", person);
    }

    @Override
    public int cost(){
        return MenuPrice.VEGETABLE_BROTH.getValue() * this.person;
    }
}
