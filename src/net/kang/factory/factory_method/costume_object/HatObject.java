package net.kang.factory.factory_method.costume_object;

import net.kang.factory.factory_method.abstract_object.AbstractCostume;

public class HatObject extends AbstractCostume {
    private String name;
    private String color;

    public HatObject(String name, String color){
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
        System.out.println(String.format("[모자] [%s] - [%s] 색상을 씌우겠습니다.", this.name, this.color));
    }
}
