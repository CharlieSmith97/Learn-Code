// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P406_02.java

package JAVA8BED8A0065B072796027_Java5;


public final class P406_02 extends Enum
{

	public static final P406_02 Mon;
	public static final P406_02 Tue;
	public static final P406_02 Wen;
	public static final P406_02 Thu;
	public static final P406_02 Fri;
	public static final P406_02 Sta;
	public static final P406_02 Sun;
	private static final P406_02 $VALUES[];

	public static P406_02[] values()
	{
		return (P406_02[])$VALUES.clone();
	}

	public static P406_02 valueOf(String name)
	{
		return (P406_02)Enum.valueOf(JAVA8BED8A0065B072796027_Java5/P406_02, name);
	}

	private P406_02(String s, int i)
	{
		super(s, i);
	}

	static 
	{
		Mon = new P406_02("Mon", 0);
		Tue = new P406_02("Tue", 1);
		Wen = new P406_02("Wen", 2);
		Thu = new P406_02("Thu", 3);
		Fri = new P406_02("Fri", 4);
		Sta = new P406_02("Sta", 5);
		Sun = new P406_02("Sun", 6);
		$VALUES = (new P406_02[] {
			Mon, Tue, Wen, Thu, Fri, Sta, Sun
		});
	}
}
