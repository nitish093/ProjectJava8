package org.example.internationalization;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

    public static void main(String[] args) throws ParseException {

        String date1 = DateFormat.getDateInstance(0, Locale.ITALY).format(new Date());
        String date2 = DateFormat.getDateInstance(1,Locale.ITALY).format(new Date());
        String date3 = DateFormat.getDateInstance(2,Locale.ITALY).format(new Date());
        String date4 = DateFormat.getDateInstance(3,Locale.ITALY).format(new Date());

        System.out.println("Date: "+date1);
        System.out.println("Date: "+date2);
        System.out.println("Date: "+date3);
        System.out.println("Date: "+date4);


        System.out.println(DateFormat.getDateInstance(0,Locale.ITALY).parse("sabato 10 agosto 2024"));
        //System.out.println(new Date());

        String us = DateFormat.getDateTimeInstance(0,0,Locale.US).format(new Date());
        System.out.println("DateTime :"+ us);

        System.out.println(DateFormat.getDateTimeInstance(0,0,Locale.US).parse("Saturday, August 10, 2024 at 9:02:54 PM India Standard Time"));
    }
}
