package com.java.courses.oca.abstracts;

/**
 * Created by Nathaniel Calderon on 9/23/2016.
 */
public interface Animal {   default String getName () { return "parent";}  static void print () { System.out.println("reached print");}}
