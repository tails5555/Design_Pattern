package net.kang.factory.factory_method.factory;

import net.kang.factory.factory_method.costume.AbstractCostume;

import net.kang.factory.factory_method.costume.CostumeObject;
import net.kang.factory.factory_method.costume.CostumeType;
import net.kang.factory.factory_method.costume.DressObject;
import net.kang.factory.factory_method.costume.HatObject;
import net.kang.factory.factory_method.costume.PantsObject;
import net.kang.factory.factory_method.costume.ShirtObject;
import net.kang.factory.factory_method.costume.ShoesObject;

public class TypeCostumeFactory extends CostumeFactory{

    @Override
    public AbstractCostume createCostume(CostumeType type, String name, String color){
        AbstractCostume abstractCostume = null;

        switch(type){
            case DRESS :
                abstractCostume = new DressObject(name, color);
                break;
            case SHIRT :
                abstractCostume = new ShirtObject(name, color);
                break;
            case PANTS :
                abstractCostume = new PantsObject(name, color);
                break;
            case SHOES :
                abstractCostume = new ShoesObject(name, color);
                break;
            case HAT :
                abstractCostume = new HatObject(name, color);
                break;
            default :
                abstractCostume = new CostumeObject(name, color);
                break;
        }

        return abstractCostume;
    }
}
