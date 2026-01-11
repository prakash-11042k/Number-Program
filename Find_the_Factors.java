import java.util.*;
class Find_the_Factors 
{
	static Scanner sc=new Scanner(System.in);
	public static void printFactors(int number) 
	{
		for (int i=1;i<=number/2;i++)
		{
			if (number%i==0)
			{
				System.out.println("Factor of"+number+"is"+i);
			}
		}
		return;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		printFactors(number);
	}	
}
