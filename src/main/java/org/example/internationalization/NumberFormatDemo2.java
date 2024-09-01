package org.example.internationalization;

import java.text.NumberFormat;

public class NumberFormatDemo2 {

    public static void main(String[] args) {
        double d = 123.4567;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);

        System.out.println(numberFormat.format(d));


    }

}
