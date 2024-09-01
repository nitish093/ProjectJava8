package org.example.internationalization;

import java.util.Arrays;
import java.util.Locale;

public class LocaleDemo1 {

    public static void main(String[] args) {
        Locale l1 = Locale.getDefault();

        System.out.println(l1);

        System.out.println(l1.getCountry()+"....."+l1.getLanguage());
        System.out.println(l1.getDisplayCountry()+"....."+l1.getDisplayLanguage());

        String[] s3 = Locale.getISOLanguages();

        //Arrays.stream(s3).sequential().forEach(System.out::println);

        String[] s4 = Locale.getISOCountries();
        //Arrays.stream(s4).forEach(System.out::println);

        Locale[] s = Locale.getAvailableLocales();
        Arrays.stream(s).forEach(l -> {
            System.out.println(l.getDisplayCountry()+"..."+l.getDisplayLanguage());
        });
    }
}
