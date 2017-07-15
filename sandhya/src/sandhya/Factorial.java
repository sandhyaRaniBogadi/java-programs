package sandhya;
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		int number,fac=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			fac=fac*i;
		}
		System.out.println("factorial of"+number+" is: "+fac);
	}
}
