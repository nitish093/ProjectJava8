package org.example.defaults;

public interface interface1 {
    default void methodA(){
        System.out.println("Inside method A "+interface1.class);
    }
}
