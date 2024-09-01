package org.example.internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) throws ParseException {
        double d = 123456.789;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);

        String format = nf.format(d);
        System.out.println("Italy Specific format: "+format);
    }
}
