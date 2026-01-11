import java.util.Scanner;
class Fibonacci_Series_without_using_Method 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the series:");
		int series=sc.nextInt();//10
		
		int n1=0,n2=1;
		System.out.print(n1+" "+n2+" ");
		
		for (int i=1;i<=series-2;i++)
		{
			int n3=n1+n2;
			System.out.print(n3+"  ");
			
			n1=n2;
			n2=n3;
		}
	}
}
