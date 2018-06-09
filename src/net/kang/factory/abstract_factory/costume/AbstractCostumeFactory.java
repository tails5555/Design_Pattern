package net.kang.factory.abstract_factory.costume;

import net.kang.factory.abstract_factory.abstract_object.AbstractCostume;

public interface AbstractCostumeFactory {
    public AbstractCostume createCostume(String name, String color);
}
