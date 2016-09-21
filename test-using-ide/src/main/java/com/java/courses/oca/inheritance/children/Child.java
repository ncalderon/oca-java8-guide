package com.java.courses.oca.inheritance.children;

import com.java.courses.oca.inheritance.Parent;

import java.beans.ExceptionListener;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.EmptyStackException;
import java.util.IllegalFormatCodePointException;

/**
 * Created by Nathaniel on 9/20/2016.
 */
public class Child extends Parent {
    @Override
    public void runtimeExceptions() throws ArithmeticException {
        super.runtimeExceptions();
    }

    @Override
    public void runtimeExceptionsErrors() throws ArithmeticException, StackOverflowError {
        super.runtimeExceptionsErrors();
    }

    @Override
    public void checkedException() {
        try {
            System.out.println("");
            super.checkedException();
        }catch (Exception ex){
            System.out.println("");
        }

    }
}
