package org.example.internationalization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

    public static void main(String[] args) {

        Locale localeUs = new Locale("en","US");
        Locale localeIn = new Locale("hi","IN");
        ResourceBundle bundle = ResourceBundle.getBundle("resource",localeUs);

        String greet = bundle.getString("greet");
        System.out.println(greet);

        String message = bundle.getString("message");

        message = MessageFormat.format(message,"Nitish K","Enjoy");

        System.out.println("Message: "+message);


    }
}
