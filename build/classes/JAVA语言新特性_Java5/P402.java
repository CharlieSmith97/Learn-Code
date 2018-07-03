// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P402.java

package JAVA8BED8A0065B072796027_Java5;

import java.io.PrintStream;
import java.util.*;

public class P402
{

	public P402()
	{
	}

	public static void main(String args[])
	{
		String arr[] = {
			"A", "B", "C", "D"
		};
		handleArray(arr);
		Set set = new HashSet();
		System.out.println("---------------------");
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		handleIterable(set);
	}

	public static void handleArray(String arr[])
	{
		String as[] = arr;
		int i = as.length;
		for (int j = 0; j < i; j++)
		{
			String string = as[j];
			System.out.println(string);
		}

	}

	public static void handleIterable(Set set)
	{
		Object object;
		for (Iterator iterator = set.iterator(); iterator.hasNext(); System.out.println(object))
			object = iterator.next();

	}
}
