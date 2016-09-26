package com.java.courses.oca.inheritance;

import java.io.IOException;
import java.rmi.server.ExportException;

/**
 * Created by Nathaniel on 9/20/2016.
 */
public class Parent {

    public int publicInt = 1;
    public static int staticInt = 5;

    public static int b;

    public void Public (){

    }

    private static void privstatic () {}
    void Default () {

    }

    protected void Protcted () {

    }

    public void runtimeExceptions () throws ArithmeticException, IllegalArgumentException {

    }

    public void runtimeExceptionsErrors () throws ArithmeticException, NoClassDefFoundError, StackOverflowError {

    }

    public void checkedException () throws Exception {

    }

    public static void Static () {
        System.out.println(staticInt);
    }

    public Parent covariant () {
        return this;
    }

    public void printInsanceVariables () {
        System.out.println("From Parent");
        System.out.println(publicInt);
        privateMethod();
    }

    private void privateMethod () {
        System.out.println("From parent private method");
    }


}
