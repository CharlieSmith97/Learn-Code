// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   P188.java

package Java976254115BF98C61part5;

import java.io.PrintStream;

// Referenced classes of package Java976254115BF98C61part5:
//			Employee1, WeekDay1

public class P188
{

	public P188()
	{
	}

	public static void main(String args[])
	{
		Employee1 ee = new Employee1();
		ee.setRestDay(WeekDay1.SaturDay);
		WeekDay1 restday = ee.getRestDay();
		static class 1
		{

			static final int $SwitchMap$Java976254115BF98C61part5$WeekDay1[];

			static 
			{
				$SwitchMap$Java976254115BF98C61part5$WeekDay1 = new int[WeekDay1.values().length];
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.Monday.ordinal()] = 1;
				}
				catch (NoSuchFieldError nosuchfielderror) { }
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.Tuesday.ordinal()] = 2;
				}
				catch (NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.WednesDay.ordinal()] = 3;
				}
				catch (NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.ThursDay.ordinal()] = 4;
				}
				catch (NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.FriDay.ordinal()] = 5;
				}
				catch (NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.SaturDay.ordinal()] = 6;
				}
				catch (NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$Java976254115BF98C61part5$WeekDay1[WeekDay1.SunDay.ordinal()] = 7;
				}
				catch (NoSuchFieldError nosuchfielderror6) { }
			}
		}

		switch (1..SwitchMap.Java976254115BF98C61part5.WeekDay1[restday.ordinal()])
		{
		case 1: // '\001'
			System.out.println("��������һ��");
			break;

		case 2: // '\002'
			System.out.println("�������ڶ���");
			break;

		case 3: // '\003'
			System.out.println("������������");
			break;

		case 4: // '\004'
			System.out.println("���������ģ�");
			break;

		case 5: // '\005'
			System.out.println("���������壡");
			break;

		case 6: // '\006'
			System.out.println("������������");
			break;

		case 7: // '\007'
			System.out.println("���������죡");
			break;

		default:
			System.out.println("��ĩ���ż٣�");
			break;
		}
		System.out.println("----------------�����У�-----------------");
		if (restday == WeekDay1.SaturDay || restday == WeekDay1.SunDay)
			System.out.println("��ĩ��Ϣ��");
		else
			System.out.println("��һ�����岻��Ϣ!");
		System.out.println(ee.getRestDay());
		System.out.println(ee.getRestDay().name());
		System.out.println(ee.getRestDay().ordinal());
	}
}
