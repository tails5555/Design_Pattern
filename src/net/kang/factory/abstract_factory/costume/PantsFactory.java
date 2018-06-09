package net.kang.factory.abstract_factory.costume;

import net.kang.factory.abstract_factory.abstract_object.AbstractCostume;
import net.kang.factory.abstract_factory.costume_object.PantsObject;

public class PantsFactory implements AbstractCostumeFactory {
    @Override
    public AbstractCostume createCostume(String name, String color){
        return new PantsObject(name, color);
    }
}
