package sandhya;
import java.util.Scanner;
public class LNArray
{
	public static void main(String args[])
	{
		int number,max,min;
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		number=sc.nextInt();
		int a[]=new int[number];
		System.out.println("enter "+number+" numbers:");
		for(j=0;j<number;j++)
		{
			a[j]=sc.nextInt();
			
		}
		min=max=a[0];
		for(j=0;j<number;j++)
		{
				if(max<a[j])
				{
					max=a[j];
				}
				if(min>a[j])
				{
					min=a[j];
				}
		}
		System.out.println("biggest number in array is " +max);
		System.out.println("Smallest number in array is " +min);
	}
}
