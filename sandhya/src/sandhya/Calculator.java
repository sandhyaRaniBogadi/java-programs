package sandhya;
import java.util.Scanner;
public class Calculator
{
	public static void main(String args[])
	{
	int num1,num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first value");
	num1=sc.nextInt();
	System.out.println("Enter the second value");
	num2=sc.nextInt();
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Modulus");
	System.out.println("Enter your choice:");
	int ch;
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:
					System.out.println("Addition is " +(num1+num2));
					break;
		case 2: 
					System.out.println("Substration is " +(num1-num2));
					break;
		case 3: 
					System.out.println("multiplication is " +(num1*num2));
					break;
		case 4: 
					System.out.println("division is " +(num1/num2));
					break;
		case 5:
					System.out.println("modulus is " +(num1%num2));
					break;
				
		default:
					System.out.println("wrong choice");	
					break;	
	}//end of switch
	}
}//end of class
