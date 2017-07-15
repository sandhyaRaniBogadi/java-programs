package sandhya;
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String args[])
	{
		int number;
		int j=0,search;
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		number=sc.nextInt();
		int a[]=new int[number];
		System.out.println("enter "+number+" numbers:");
		for(j=0;j<number;j++)
		{
			a[j]=sc.nextInt();
		}
		System.out.println("Enter the search element:");
		search=sc.nextInt();
		for(j=0;j<number;j++)
		{
			if(a[j]==search)
			{
				search=1;
				break;
			}
		}
		if(search==1)
		System.out.println("element found");
		else
			System.out.println("element not found");
	}
}
