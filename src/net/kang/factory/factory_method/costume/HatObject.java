package net.kang.factory.factory_method.costume;

public class HatObject extends AbstractCostume{
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
    public String putOn(){
        return String.format("[모자] [%s] - [%s] 색상을 씌우겠습니다.", this.name, this.color);
    }
}
