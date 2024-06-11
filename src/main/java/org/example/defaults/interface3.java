package org.example.defaults;

public interface interface3 extends interface2{
    default void methodC(){
        System.out.println("Inside method C "+interface3.class);
    }
}
