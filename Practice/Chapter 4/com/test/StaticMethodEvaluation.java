package com.test;
import com.test.statics.*;

public class StaticMethodEvaluation {
	public static void main (String ... args) {
		StaticClass.staticMethod();
		StaticClass staticClass = new StaticClass();
		staticClass.staticMethod();
		staticClass = null;		
		staticClass.staticMethod();

	}
}