// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P408.java

package JAVA8BED8A0065B072796027_Java5;

import java.io.PrintStream;
import javax.swing.JOptionPane;

public class P408
{

	public P408()
	{
	}

	public static void main(String args[])
	{
		int b = 5;
		System.out.println(b);
		String str = "C";
		String s = str;
		byte byte0 = -1;
		switch (s.hashCode())
		{
		case 65: // 'A'
			if (s.equals("A"))
				byte0 = 0;
			break;

		case 66: // 'B'
			if (s.equals("B"))
				byte0 = 1;
			break;

		case 67: // 'C'
			if (s.equals("C"))
				byte0 = 2;
			break;
		}
		switch (byte0)
		{
		case 0: // '\0'
			JOptionPane.showMessageDialog(null, "This is A!");
			break;

		case 1: // '\001'
			JOptionPane.showMessageDialog(null, "This is B!");
			break;

		case 2: // '\002'
			JOptionPane.showMessageDialog(null, "This is C!");
			break;

		default:
			JOptionPane.showMessageDialog(null, "你输入的信息不在该范围里面！");
			break;
		}
	}
}
