package sandhya;
import java.util.Scanner;
public class BiggestNumber
{
	public static void main(String args[])
	{
		int num, max,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		max=num%10;
		while(num>0)
		{
			b=num%10;
			num=num/10;
			if(max<b)
			{
				max=b;
			}
		}
		System.out.println("Biggest digit in a number is:"+max);
	}
}
