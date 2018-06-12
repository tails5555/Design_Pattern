package net.kang.decorator.main_cooking;

public abstract class BoodaeChigae {
    protected String description;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public abstract int cost();
}
