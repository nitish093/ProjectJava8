package org.example.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello Optional");
        System.out.println(optional.isPresent());

        if(optional.isPresent())
        {
            System.out.println(optional.get());
        }

        optional.ifPresent(s-> System.out.println(s));
    }

}
