package sandhya;
import java.util.Scanner;
public class BubbleSort
{
	public static void main(String args[])
	{
		int number;
		int k=0,i=0,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		number=sc.nextInt();
		int a[]=new int[number];
		System.out.println("enter "+number+" numbers:");
		for(j=0;j<number;j++)
		{
			a[j]=sc.nextInt();
		}
		for(j=0;j<number;j++)
		{
			for(i=0;i<number-j-1;i++)
			{
				if(a[i]>a[i+1])
				{
					a[k]=a[i+1];
					a[i+1]=a[i];
					a[i]=a[k];
				}
			}
		}
		System.out.println("The sorted list is:");
		for(j=0;j<number;j++)
		{
			System.out.println(a[j]);
		}
	}

}
