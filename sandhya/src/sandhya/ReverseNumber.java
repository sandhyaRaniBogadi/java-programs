package sandhya;
import java.util.Scanner;
public class ReverseNumber 
{
	public static void main(String args[])
	{
		int num,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		while(num>0)
		{
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
		System.out.println("Reverse of a number is"+sum);
	}
}
