package com.java.courses.oca.def;

import com.java.courses.oca.protect.ProtectClass;

/**
 * Created by Nathaniel on 9/17/2016.
 */
public class DefClass extends ProtectClass {
    String defaultField;
    public  int number;
    public DefClass () {
        super(3);
        super.protectField = "value";


    }
}
