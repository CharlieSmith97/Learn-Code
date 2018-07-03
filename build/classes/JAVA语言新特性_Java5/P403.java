// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P403.java

package JAVA8BED8A0065B072796027_Java5;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package JAVA8BED8A0065B072796027_Java5:
//			P400

public class P403
{

	public P403()
	{
	}

	public static void main(String args[])
	{
		P400 p1 = new P400("手机", Integer.valueOf(888), Integer.valueOf(10));
		P400 p2 = new P400("充电宝", Integer.valueOf(50), Integer.valueOf(12));
		P400 p3 = new P400("内存条", Integer.valueOf(900), Integer.valueOf(13));
		List st = new ArrayList();
		st.add(p1);
		st.add(p2);
		st.add(p3);
		List li = fiter1(st);
		System.out.println(li);
	}

	public static List fiter(List list)
	{
		Iterator iterator = list.iterator();
		do
		{
			if (!iterator.hasNext())
				break;
			Object O = iterator.next();
			P400 pp = (P400)O;
			if (pp.getPrice().intValue() < 200)
				list.remove(pp);
		} while (true);
		return list;
	}

	public static List fiter1(List list)
	{
		Iterator it = list.iterator();
		do
		{
			if (!it.hasNext())
				break;
			P400 pp = (P400)it.next();
			if (pp.getPrice().intValue() < 200)
				list.remove(pp);
		} while (true);
		return list;
	}
}
