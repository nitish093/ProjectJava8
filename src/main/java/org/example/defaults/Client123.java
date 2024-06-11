package org.example.defaults;

public class Client123 implements interface1,interface2,interface3{

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA(); // resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }
}
