package com.calc.duplicate.extendedcalc;
import com.calc.duplicate.Samplecalc.*;
import java.util.Scanner;
public class Exc extends Samplec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int x=sc.nextInt();
		System.out.println("Enter First Number:");
		int y=sc.nextInt();
		Exc e=new Exc();
		e.setNum1(x);
		e.sum();
		System.out.println("Addition is:"+e.sum());
		e.setNum2(y);
		e.subs();
		System.out.println("Substraction is:"+e.subs());
	}
}
