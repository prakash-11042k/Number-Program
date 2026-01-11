import java.util.Scanner;
class Check_Number_is_Even_or_Odd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
		
		if (number%2==0)
		{
			System.out.println("Even number");
		}
		else
			System.out.println("Odd number");
	}
}
