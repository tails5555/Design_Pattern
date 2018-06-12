package net.kang.decorator.main_cooking;

import net.kang.decorator.enumeration.MenuPrice;

// 사골 육수 부대 찌개 객체 생성
public class BoneBrothBoodaeChigae extends BoodaeChigae {
    private int person;

    public BoneBrothBoodaeChigae(int person){
        this.person = person;
        super.setDescription(String.format("사골 육수 부대찌개 %d인분", person));
        System.out.printf("[주문] 사골 육수 부대찌개 %d인분 주문했습니다.\n", person);
    }

    @Override
    public int cost(){
        return MenuPrice.BONE_BROTH.getValue() * this.person;
    }
}
