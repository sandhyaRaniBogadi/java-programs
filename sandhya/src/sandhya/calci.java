package sandhya;
import java.util.*;
import java.lang.Math;
public class calci 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("---Menu---");
		System.out.println("1.Basic calculator");
		System.out.println("2.static calculator");
		System.out.println("Enter Your choice:");
		int c=sc.nextInt();
		Base b=new Base();
		if(c==1)
		{
			b.menu();
			b.userInput();
			b.operations();
		}
		if(c==2)
		{
			Static s=new Static();
			s.menu();
			s.userInput();
			s.opearations();
		}
	}
}
