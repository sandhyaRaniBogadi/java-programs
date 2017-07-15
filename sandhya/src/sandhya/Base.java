package sandhya;

import java.util.Scanner;

public class Base
{
	public int val1,val2,ch;
	void userInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		val1=sc.nextInt();
		System.out.println("Enter second number:");
		val2=sc.nextInt();
		
	}
	void menu()
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.Division");
		System.out.println("5.exit");
		System.out.print("Enter your Choice:");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
	}
	void operations()
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
			case 5: System.out.println("bye");
					break;
			default: System.exit(0);
					break;
		}
	}
}	

