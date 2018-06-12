package net.kang.decorator.client;

import net.kang.decorator.main_cooking.BoneBrothBoodaeChigae;
import net.kang.decorator.main_cooking.BoodaeChigae;
import net.kang.decorator.main_cooking.FishBrothBoodaeChigae;
import net.kang.decorator.main_cooking.VegetableBrothBoodaeChigae;
import net.kang.decorator.sub_ingredient.CheesePlusBoodaeChigae;
import net.kang.decorator.sub_ingredient.RamenPlusBoodaeChigae;
import net.kang.decorator.sub_ingredient.RedBeanPlusBoodaeChigae;
import net.kang.decorator.sub_ingredient.SpamSausagePlusBoodaeChigae;

public class MainClient {
    public static void main(String[] args){
        System.out.println("[멸치 육수 부대찌개 주문]");
        BoodaeChigae fishBrothBoodaeChigae = new FishBrothBoodaeChigae(3);
        System.out.printf("- 주문 속성 : %s\n", fishBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", fishBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[주문 완료 후 멸치 육수 치즈 추가]");
        fishBrothBoodaeChigae = new CheesePlusBoodaeChigae(fishBrothBoodaeChigae, 2);
        System.out.printf("- 주문 속성 : %s\n", fishBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", fishBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[주문 완료 후 멸치 육수 라면 사리 추가]");
        fishBrothBoodaeChigae = new RamenPlusBoodaeChigae(fishBrothBoodaeChigae, 1);
        System.out.printf("- 주문 속성 : %s\n", fishBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", fishBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[사골 육수 부대찌개 주문]");
        BoodaeChigae boneBrothBoodaeChigae = new BoneBrothBoodaeChigae(5);
        System.out.printf("- 주문 속성 : %s\n", boneBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", boneBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[주문 완료 후 사골 육수 스팸 / 소시지 추가]");
        boneBrothBoodaeChigae = new SpamSausagePlusBoodaeChigae(boneBrothBoodaeChigae, 3);
        System.out.printf("- 주문 속성 : %s\n", boneBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", boneBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[야채 육수 부대찌개 주문]");
        BoodaeChigae vegetableBrothBoodaeChigae = new VegetableBrothBoodaeChigae(7);
        System.out.printf("- 주문 속성 : %s\n", vegetableBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", vegetableBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[주문 완료 후 통조림 콩 추가]");
        vegetableBrothBoodaeChigae = new RedBeanPlusBoodaeChigae(vegetableBrothBoodaeChigae, 2);
        System.out.printf("- 주문 속성 : %s\n", vegetableBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", vegetableBrothBoodaeChigae.cost());
        System.out.println();

        System.out.println("[주문 완료 후 라면 사리 추가]");
        vegetableBrothBoodaeChigae = new RamenPlusBoodaeChigae(vegetableBrothBoodaeChigae, 2);
        System.out.printf("- 주문 속성 : %s\n", vegetableBrothBoodaeChigae.getDescription());
        System.out.printf("- 후불 가격 : %d원\n", vegetableBrothBoodaeChigae.cost());
    }
}
