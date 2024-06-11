package org.example.defaults;

public interface interface2 extends interface1{
    default void methodB(){
        System.out.println("Inside method B");
    }

    default void methodA(){
        System.out.println("Inside method A "+interface2.class);
    }
}
