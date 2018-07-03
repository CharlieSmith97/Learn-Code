// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P404.java

package JAVA8BED8A0065B072796027_Java5;

import java.io.PrintStream;

public class P404
{

	public P404()
	{
	}

	public static void main(String args[])
	{
		Integer num1 = Integer.valueOf(17);
		int num2 = num1.intValue();
		Integer n1 = new Integer(17);
		Integer n2 = new Integer(17);
		System.out.println(n1 == n2);
		System.out.println("-----------------------------");
		Integer n3 = Integer.valueOf(17);
		Integer n4 = Integer.valueOf(17);
		System.out.println(n3 == n4);
		System.out.println("-----------------------------");
		Integer n5 = Integer.valueOf(17);
		Integer n6 = Integer.valueOf(17);
		System.out.println(n5 == n6);
	}
}
