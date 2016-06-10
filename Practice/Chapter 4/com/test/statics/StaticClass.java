package com.test.statics;

public class StaticClass {
	private static String message = "message from nonstatic variable member";
	static	{
		String message = "";
		message = "set message value from static statement";
	}
	public static void staticMethod  () {
		System.out.println(message);
	}
}