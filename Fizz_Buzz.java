import java.util.*;
class Fizz_Buzz
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		
		 if (num%3==0 && num%5==0)
		 {
			 System.out.println("FIZZBUZZ");
		 }
		 
		 else if (num%3==0)
		 {
			 System.out.println("Fizz");
		 }
		 
		 else if (num%5==0)
		 {
			 System.out.println("BUZZ");
		 }
		 
		 else
			 System.out.println("This num not divisible 3 & 5");
		
		
	}
}
