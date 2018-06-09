package net.kang.factory.factory_method.client;

import net.kang.factory.factory_method.abstract_object.AbstractCostume;
import net.kang.factory.factory_method.factory_object.TypeCostumeFactory;

import static net.kang.factory.factory_method.costume_object.CostumeType.*;

public class MainClient {
    public static void main(String[] args){
        TypeCostumeFactory typeCostumeFactory = new TypeCostumeFactory();

        System.out.println("캐릭터 A에게 다음과 같은 옷을 입혀보겠습니다.");

        AbstractCostume costume01 = typeCostumeFactory.createCostume(SHIRT, "A사 티셔츠", "파란색");
        AbstractCostume costume02 = typeCostumeFactory.createCostume(PANTS, "B사 바지", "검은색");
        AbstractCostume costume03 = typeCostumeFactory.createCostume(SHOES, "A사 운동화", "베이지색");

        costume01.putOn();
        costume02.putOn();
        costume03.putOn();

        System.out.println("캐릭터 B에게 다음과 같은 옷을 입혀보겠습니다.");

        AbstractCostume costume04 = typeCostumeFactory.createCostume(HAT, "C사 페도라", "연녹색");
        AbstractCostume costume05 = typeCostumeFactory.createCostume(DRESS, "B사 드레스", "연녹색");
        AbstractCostume costume06 = typeCostumeFactory.createCostume(SHOES, "B사 구두", "하얀색");

        costume04.putOn();
        costume05.putOn();
        costume06.putOn();
    }
}
