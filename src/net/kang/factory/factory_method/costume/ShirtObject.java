package net.kang.factory.factory_method.costume;

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
    public String putOn(){
        return String.format("[상의] [%s] - [%s] 색상을 입히겠습니다.", this.name, this.color);
    }
}
