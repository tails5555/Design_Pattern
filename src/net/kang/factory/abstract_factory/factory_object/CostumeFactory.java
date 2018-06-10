package net.kang.factory.abstract_factory.factory_object;

import net.kang.factory.abstract_factory.abstract_object.AbstractCostume;
import net.kang.factory.abstract_factory.costume.AbstractCostumeFactory;

public class CostumeFactory {
    public static AbstractCostume getCostume(AbstractCostumeFactory abstractCostumeFactory, String name, String color){
        return abstractCostumeFactory.createCostume(name, color);
    }
}
