package sandhya;
import java.util.*;
public class ReverseFabbinocci
{
	public static void main(String args[])
	{
		int num1=0,num2=1,num3, fab;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num3=sc.nextInt();
		System.out.print(num1+" "+num2+" ");
		for(int i=2;i<num3;++i)
		{
			fab=num1+num2;
			System.out.print(fab+" ");
			num1=num2;
			num2=fab;
		}
		System.out.println("Reverse fabbinocci series:");
	}
}
