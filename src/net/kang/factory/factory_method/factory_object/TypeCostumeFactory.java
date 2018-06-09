package net.kang.factory.factory_method.factory_object;

import net.kang.factory.factory_method.abstract_object.AbstractCostume;

import net.kang.factory.factory_method.costume_object.CostumeObject;
import net.kang.factory.factory_method.costume_object.CostumeType;
import net.kang.factory.factory_method.costume_object.DressObject;
import net.kang.factory.factory_method.costume_object.HatObject;
import net.kang.factory.factory_method.costume_object.PantsObject;
import net.kang.factory.factory_method.costume_object.ShirtObject;
import net.kang.factory.factory_method.costume_object.ShoesObject;

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
