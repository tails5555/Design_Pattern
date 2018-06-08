package net.kang.singleton;

import java.util.Arrays;

class SaunaKey{
    private boolean[] keys;
    private static SaunaKey instance = null;
    private SaunaKey(){
        this.keys = new boolean[10];
    }
    public static SaunaKey getInstance(){
        if(instance == null)
            instance = new SaunaKey();
        return instance;
    }
    public void setKey(int x){
        if(x<0 && x>10) return;
        if(keys[x]==false)
            keys[x]=true;
    }
    @Override
    public String toString(){
        return Arrays.toString(this.keys);
    }
}
public class Example01 {
    public static void main(String[] args){
        SaunaKey saunaKey = SaunaKey.getInstance();
        System.out.println(saunaKey);
        for(int k=0;k<=4;k++){
            saunaKey.setKey(k);
            System.out.println(saunaKey);
        }

    }
}
