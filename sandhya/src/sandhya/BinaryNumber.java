package sandhya;
import java.util.Scanner;
public class BinaryNumber
{
	public static void main(String args[])
	{
		int number,rem=0, qu=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		while(number!=0)
		{
			 rem=number%10;
			 qu=number/10;
			 number=qu;		
		}
		if(rem==0 || rem==1)
		{
			System.out.println("it is a binary number");
		}
		else
		{
			System.out.println("it is not a binary number");
		}
	}
}
