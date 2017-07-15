package sandhya;
import java.util.Scanner;
public class SecondHighestNumber
{
	public static void main(String args[])
	{
		int num, max,b,min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		max=min=num%10;
		while(num>0)
		{
			b=num%10;
			num=num/10;
			if(max<=b)
			{
				max=b;
				break;
			}
			if(min>b)
			{
				min=b;
			}
		}
		System.out.println("Second hightest digit in a number is:"+min);
	}
}
