package sandhya;
import java.util.*;
public class Sum
{
	public static void main(String args[])
	{
		int num1,num2, num3, num4, num5;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st number:");
		num1=sc.nextInt();
		System.out.print("enter 2nd number:");
		num2=sc.nextInt();
		System.out.print("enter 3rd number:");
		num3=sc.nextInt();
		System.out.print("enter 4th number:");
		num4=sc.nextInt();
		System.out.print("enter 5th number:");
		num5=sc.nextInt();
		int add= num1+num2+num3+num4+num5;
		System.out.print("The sum of five numbers are: "+add);
	}
}
