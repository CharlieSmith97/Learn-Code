// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P248.java

package 68385FC37C7B5E93_7EBF7A0BPart1;

import java.io.PrintStream;

public class P248
{

	public P248()
	{
	}

	public static void main(String args[])
	{
		for (int i = 0; i < 50; i++)
		{
			System.out.println("ÍæÓÎÏ·£¡");
			if (i == 10)
				(new Thread(new Runnable() {

					public void run()
					{
					}

				})).start();
		}

	}
}
