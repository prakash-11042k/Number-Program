import java.util.*;
class Spy_Number_or_Not
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		
		if (checkSpy(number))
		{
			System.out.println("Spy number");
		}
		else
			System.out.println("Not spynumber");
	}
	public static boolean checkSpy(int number)
	{
		int sum=0;
		int product=1;
		
		while (number>0)
		{
			sum=sum+number%10;
			product=product*number%10;
			number=number/10;
		}
	    return sum==product;
	}
}


/*
Spy number is 123,1124
*/