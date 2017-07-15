package sandhya;
import java.util.*;
public class MatrixAddition
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i;
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st matrix:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd matrix:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix addition is ");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			
		}
		
	}
	
}
