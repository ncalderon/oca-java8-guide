package test;

import static test.StaticEvaluation.*;

public class StaticEvaluation {
	{
		System.out.println("Prueba");
	}

	public static void main (String ... args) {
		StaticEvaluation staticEvaluation2 = new StaticEvaluation();
		StaticEvaluation staticEvaluation = null;
		staticEvaluation.method();
		method();
	}

	public static void method () {
		System.out.println("Static Method");	
		return;
	}

	public Integer method2 () {
		return null;
	}

}