import java.util.Scanner;
class Factorial_Number_Recursion 
{
	static Scanner sc=new Scanner(System.in);
	static int ans=1;
	public static void main(String[] args) 
	{
		System.out.println("Starts");
		System.out.print("Enter the number:");
		int number=sc.nextInt();//5
		
		int res=findFactorial(number);
		System.out.println("Result:"+res);
		System.out.print("Ends");
	}
	public static int findFactorial(int number)
	{
		if (number>=2)
		{
			ans=ans*number;
			number--;
			
			findFactorial(number);
		}
		return ans;
	}
}
