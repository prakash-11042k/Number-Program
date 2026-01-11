import java.util.*;
class Factorial_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static int findFactorial(int number)
	{
		int ans=1;
		for (int i=number;i>=2;i-- )
		{
			ans=ans*i;
		}
		return ans;
	}
	public static void main(String[]args)
	{
		System.out.print("\t\t\tEnter a num:");
		int number=sc.nextInt();
		int res=findFactorial(number);
		System.out.println("Result:"+res);
		return;
	}	
}
