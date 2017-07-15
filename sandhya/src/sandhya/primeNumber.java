package sandhya;
import java.util.Scanner;
public class primeNumber 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int count=0;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		while(num>=2)
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					count=count+1;
				}
			}
			if(count==0)
			{
				sum=sum+num;
			}
			--num;
		}
		System.out.println("sum of first prime numbers are:"+sum);
	}
}
