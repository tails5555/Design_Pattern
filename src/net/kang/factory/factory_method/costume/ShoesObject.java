package net.kang.factory.factory_method.costume;

public class ShoesObject extends AbstractCostume{
    private String name;
    private String color;

    public ShoesObject(String name, String color){
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
        return String.format("[신발] [%s] - [%s] 색상을 신겠습니다.", this.name, this.color);
    }
}
