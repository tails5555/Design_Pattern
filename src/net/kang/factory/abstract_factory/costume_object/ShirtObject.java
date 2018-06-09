package net.kang.factory.abstract_factory.costume_object;

import net.kang.factory.abstract_factory.abstract_object.AbstractCostume;

public class ShirtObject extends AbstractCostume{
    private String name;
    private String color;

    public ShirtObject(String name, String color){
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
        System.out.println(String.format("[상의] [%s] - [%s] 색상을 입히겠습니다.", this.name, this.color));
    }
}
