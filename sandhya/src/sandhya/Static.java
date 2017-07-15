package sandhya;

import java.util.Scanner;
import java.lang.Math;

public class Static
{
	double val1,val2,val;
	int ch;
	void userInput()
	{
		Scanner sc=new Scanner(System.in);
		if(ch==6 || ch==7)
		{
			System.out.println("Enter number:");
			val1=sc.nextInt();
		}
		else
		{
			System.out.println("Enter First number:");
			val1=sc.nextInt();
			System.out.println("Enter second number:");
			val2=sc.nextInt();
		}
	}
	void menu()
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.Division");
		System.out.println("5.power");
		System.out.println("6.square root");
		System.out.println("7.sine of");
		System.out.println("8.exit");
		System.out.print("Enter your Choice:");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
	}
	void opearations()
	{
		switch(ch)
		{
			case 1: System.out.println("additon is "+(val1+val2));
					break;
			case 2: System.out.println("Substraction is "+(val1-val2));
					break;
			case 3: System.out.println("Multiplication is "+(val1*val2));
					break;
			case 4: System.out.println("Division is "+(val1-val2));
					break;
			case 5: System.out.println("power is:"+Math.pow(val1, val2));
					break;
			case 6: System.out.println("square root is:"+ Math.sqrt(val1));
					break;
			case 7: double rad=Math.toRadians(val1);
					System.out.println("sine is:"+Math.sin(rad));
					break;
			case 8: System.out.println("bye");
					break;
			default: System.exit(0);
					break;
		}
	}
}
