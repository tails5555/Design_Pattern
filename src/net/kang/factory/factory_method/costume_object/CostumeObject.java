package net.kang.factory.factory_method.costume_object;

import net.kang.factory.factory_method.abstract_object.AbstractCostume;

public class CostumeObject extends AbstractCostume {
    private String name;
    private String color;

    public CostumeObject(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getColor(){
        return this.color;
    }

    @Override
    public void putOn(){
        System.out.println(String.format("[종류 미상] [%s] - [%s] 색상을 입히겠습니다.", this.name, this.color));
    }
}