package sandhya;
import java.util.*;
public class Swapping 
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		num1=sc.nextInt();
		System.out.println("enter 2nd number");
		num2=sc.nextInt();
		System.out.println("before swapping:"+num1+" "+num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after swapping:"+num1+" "+num2);
		
	}
}
