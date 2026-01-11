import java.util.Scanner;
class Check_Number_is_Palindrome_or_Not 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		int rev=0;
		int temp=number;
		
		while (number>0)
		{
			rev=(rev*10)+(number%10);
			number=number/10;
		}
		if (temp==rev)
		{
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not-Palindrome");
		}
	}
}

/*
A palindrome number is : 11,121,151,353,1331,9009,75257,1234321
*/
