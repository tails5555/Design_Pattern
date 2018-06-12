package net.kang.decorator.main_cooking;

import net.kang.decorator.enumeration.MenuPrice;

// 멸치 육수 부대 찌개 객체 생성
public class FishBrothBoodaeChigae extends BoodaeChigae {
    private int person;

    public FishBrothBoodaeChigae(int person){
        this.person = person;
        super.setDescription(String.format("멸치 육수 부대찌개 %d인분", person));
        System.out.printf("[주문] 멸치 육수 부대찌개 %d인분 주문했습니다.\n", person);
    }

    @Override
    public int cost(){
        return MenuPrice.FISH_BROTH.getValue() * this.person;
    }
}
