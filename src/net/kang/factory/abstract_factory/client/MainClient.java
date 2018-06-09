package net.kang.factory.abstract_factory.client;

import net.kang.factory.abstract_factory.abstract_object.AbstractCostume;
import net.kang.factory.abstract_factory.costume.DressFactory;
import net.kang.factory.abstract_factory.costume.HatFactory;
import net.kang.factory.abstract_factory.costume.PantsFactory;
import net.kang.factory.abstract_factory.costume.ShirtFactory;
import net.kang.factory.abstract_factory.costume.ShoesFactory;
import net.kang.factory.abstract_factory.factory_object.CostumeFactory;

public class MainClient {
    public static void main(String[] args){
        AbstractCostume dress = CostumeFactory.getCostume(new DressFactory(), "웨딩드레스", "하얀색");
        AbstractCostume shirt = CostumeFactory.getCostume(new ShirtFactory(), "맨투맨", "줄무늬");
        AbstractCostume pants = CostumeFactory.getCostume(new PantsFactory(), "반바지", "파란색");
        AbstractCostume shoes = CostumeFactory.getCostume(new ShoesFactory(), "슬리퍼", "검은색");
        AbstractCostume hat = CostumeFactory.getCostume(new HatFactory(), "일리네어 스냅백", "하얀색");

        dress.putOn();
        shirt.putOn();
        pants.putOn();
        shoes.putOn();
        hat.putOn();
    }
}
