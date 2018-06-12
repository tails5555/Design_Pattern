package net.kang.decorator.enumeration;

public enum MenuPrice {
    VEGETABLE_BROTH(6000), FISH_BROTH(7000), BONE_BROTH(8000),
    CHEESE(500), RAMEN(800), RED_BEAN(1000), SPAM_SAUSAGE(2000);

    private final int value;
    private MenuPrice(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
