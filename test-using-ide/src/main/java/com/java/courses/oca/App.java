package com.java.courses.oca;

import com.java.courses.oca.def.DefClass;
import com.java.courses.oca.inheritance.Parent;
import com.java.courses.oca.protect.ProtectClass;
import sun.reflect.annotation.ExceptionProxy;

import java.io.IOException;
import java.rmi.server.ExportException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.*;
import java.util.function.Predicate;

import static java.lang.System.*;

public class App
{
    static void sum(int a,long b){System.out.println("a method invoked");}

    public static void main( String[] args )
    {
        try {

        }catch (IOException e){

        }

        StringBuilder s1 = new StringBuilder("hola");
        ProtectClass a = new ProtectClass(2);

        //howMany(true, {1,2,3});
        /*int a = 5;
        final int b = 5;
        switch (a) {
            default:
                out.print("reached too");
            case b:
                out.print("reached");
        }*/
        /*Period period = Period.ofDays(5).ofYears(5);
        period.plusDays(5);

        out.println(period.getDays());
        out.println(period.getYears());*/

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

    public static void howMany (boolean one, int ... many) {
        out.println(many.length);
        out.println("reached");

    }


}

