package sandhya;
import java.util.Scanner;
public class Palendrome
{
	public static void main(String args[])
	{
		int num,temp,a,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Given number is palendrome");
		}
		else
		{
			System.out.println("Given number is not a palendrome");
		}
	}
}
