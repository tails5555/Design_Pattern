package net.kang.factory.factory_method.factory;

import net.kang.factory.factory_method.costume.AbstractCostume;
import net.kang.factory.factory_method.costume.CostumeType;

public abstract class CostumeFactory {
    public abstract AbstractCostume createCostume(CostumeType type, String name, String color);
}
