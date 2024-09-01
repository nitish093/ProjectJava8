package org.example.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo1 {

    public static void main(String[] args) throws ParseException {
        double d = 123456.789;
        Locale india = new Locale("pa","IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(india);
        System.out.println(nf.format(d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf1.format(d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(d));

//        NumberFormat nf3 = NumberFormat.getPercentInstance(Locale.US);
//        System.out.println(nf3);


        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf3.parse("$123,456.79"));


    }
}
