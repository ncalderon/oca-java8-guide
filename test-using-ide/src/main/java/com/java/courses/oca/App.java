package com.java.courses.oca;

import com.java.courses.oca.def.DefClass;
import com.java.courses.oca.inheritance.Parent;
import com.java.courses.oca.inheritance.children.Child;
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

class Reindeer extends App {

}

public class App
{

    /*static void sum(int a,int b){System.out.println("int method invoked");}
    static void sum(long a,long b){System.out.println("long method invoked");}*/

    public static void main( String[] args )
    {

        int x = 5, j = 0;
        OUTER: for (int i = 0; i < 3; )
            INNER: do {

            } while(j <=2);

        /*Child c = new Child();
        try {
            c.checkedException();
        } catch (Exception e) {
            out.println("reached Ex");
            e.printStackTrace();
        } catch (Error e) {
            out.println("reached Error");
            e.printStackTrace();
        }

        System.out.println("reached after error");*/

        /*App a = new Reindeer(4);
        out.print(", "  + a.hasHorns());
        Reindeer r = (Reindeer) a;
        out.print(", "  + r.hasHorns());*/
        /*List<Integer> l = new ArrayList<>(5);
        int [] i = new int[3];
        int [] b [] = new int[3][];
        int d = 5, e [][];
        e = new int[4][];
        out.println(d);
        out.println(e);
        out.println(Arrays.toString(e));
        out.println(l);*/

        /*boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3){
            int y = (1 + 2 * count) % 3;
            out.println("Loop: " + count + ", Y: " + y);
            switch (y){
                default:
                    out.println("reached default");
                case 0: x -= 1; out.println("reached 0"); break;
                case 1: x+= 5; out.println("reached 5");
            }
            out.println(x);
        }*/
        //out.println(x);

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

