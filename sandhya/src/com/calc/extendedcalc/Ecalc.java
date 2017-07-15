package com.calc.extendedcalc;
import java.util.Scanner;
import com.calc.*;
import com.calc.maincalc.*;
public class Ecalc extends SampleCalc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		boolean x;
		System.out.println("---CHOICE---");
		System.out.println("perform opertions on 3 variables");
		System.out.println("perform operations on 2 variables");
		System.out.println("Enter your choice:");
		int c=sc.nextInt();
		Ecalc s=new Ecalc();
		MainCalc m=new MainCalc();
		if(c==1)
		{
			while(x=true)
			{
				System.out.println("Enter First number:");
				int val1=sc.nextInt();	
				System.out.println("Enter Second number:");
				int val2=sc.nextInt();
				System.out.println("Enter Third number:");
				int val3=sc.nextInt();
				m.menu();
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:s.add(val1, val2, val3);
							break;
					case 2:s.sub(val1, val2, val3);
							break;
					case 3: System.exit(0);
							x=false;
							break;		
					default: System.out.println("wrong choice");
							break;
				}
			}
		}
		if(c==2)
		{
			while(x=true)
			{
				System.out.println("Enter First number:");
				int val1=sc.nextInt();	
				System.out.println("Enter Second number:");
				int val2=sc.nextInt();
				m.menu();
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:s.add(val1, val2);
							break;
					case 2:s.sub(val1, val2);
							break;
					case 3: System.exit(0);
							x=false;
							break;
					default: System.out.println("wrong choice");
							break;
				}
		
			}
		}
		else
		{
			System.out.println("wrong choice");
		}
	}
}
