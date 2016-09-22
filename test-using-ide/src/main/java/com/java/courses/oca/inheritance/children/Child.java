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

    public Child() {
        super();
    }


    @Override
    public void Public() {
        super.Public();
    }

    @Override
    protected void Protcted() {
        super.Protcted();
    }

    @Override
    public void runtimeExceptions() throws Error {
        super.runtimeExceptions();
    }

    @Override
    public void runtimeExceptionsErrors() throws ArithmeticException, StackOverflowError {
        super.runtimeExceptionsErrors();
    }

    @Override
    public void checkedException() throws Error, Exception{
       throw new Error();
    }
}
