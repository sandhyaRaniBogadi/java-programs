package sandhya;
import java.util.Scanner;
public class Swap2Numners 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second number:");
		int num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping");
		System.out.println("First number is:"+num1);
		System.out.println("Second number is:"+num2);
		
	}
}
