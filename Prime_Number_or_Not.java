import java.util.*;
class Prime_Number_or_Not 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isPrime(int number) 
	{
		if (number==0 && number==1)
			return false;
		for (int i=2;i<number;i++)
		{
			if (number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
		if (isPrime(number))
		{
			System.out.println("Prime number");
		}
		else
			System.out.println("Not prime number");
	}
}
