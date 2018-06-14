package net.kang.singleton.client;

import net.kang.singleton.single_object.Singleton01;
import net.kang.singleton.single_object.Singleton05;
import net.kang.singleton.single_object.SingletonEnumeration;

public class MainClient01 {
    public static void main(String[] args){
        System.out.println("[Main Singleton Test]");
        Singleton01 singleton01_primary = Singleton01.getInstance();
        Singleton01 singleton01_secondary = Singleton01.getInstance();
        System.out.println();

        System.out.println("[Inner Class Singleton Test]");
        Singleton05 singleton05_primary = Singleton05.getInstance();
        Singleton05 singleton05_secondary = Singleton05.getInstance();
        System.out.println();

        System.out.println("[Enumeration Class Singleton Test]");
        SingletonEnumeration singletonEnumeration = SingletonEnumeration.getInstance();
    }
}
