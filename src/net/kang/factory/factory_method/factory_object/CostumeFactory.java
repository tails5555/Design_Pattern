package net.kang.factory.factory_method.factory_object;

import net.kang.factory.factory_method.abstract_object.AbstractCostume;
import net.kang.factory.factory_method.costume_object.CostumeType;

public abstract class CostumeFactory {
    public abstract AbstractCostume createCostume(CostumeType type, String name, String color);
}
