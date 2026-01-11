import java.util.Scanner;
class Fibonacci_Series_Recursion 
{
	static Scanner sc=new Scanner(System.in);
	static int series;
	public static void main(String[] args) 
	{
		System.out.println("Starts");
		System.out.print("Series:");
		series=sc.nextInt();
		
		Fibo(0,1,0);
		System.out.println("\nEnds");
	}
	public static void Fibo(int n1,int n2,int n3)
	{
		if (series>=1)
		{
			System.out.print(n3+" ");
			
			n1=n2;
			n2=n3;
			n3=n1+n2;
			series--;
			Fibo(n1,n2,n3);
		}
	}	
}
