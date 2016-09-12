package com.java.courses.oca;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;

import static java.lang.System.*;

public class App 
{
    public static void main( String[] args )
    {

        Period period = Period.ofDays(5).ofYears(5);
        period.plusDays(5);

        out.println(period.getDays());
        out.println(period.getYears());

        /*String s = "value";
        String s2 = s.substring(1).substring(1);
        String s3 = s.replace('v','$').replace('a','$');
        System.out.println(s3);*/

        /*ArrayList<Integer> list = new ArrayList<Integer>(3);
        list.add(3);
        list.add(null);
        out.println(Arrays.toString(list.toArray()));
        String arr[] = {"5", "3","3", "a","a"};
        String [] a = list.toArray(arr);
        out.println(Arrays.toString(a));*/

        /*System.out.println((5*5));
        double a = 5 * 5;
        long b = 5 * 5;*/

    }


}

