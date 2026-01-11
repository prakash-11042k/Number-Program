import java.util.Scanner;
class Sum_of_Prime_Numbers_In_Range 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter lower range:");
		int lr=sc.nextInt();
		System.out.print("Enter higher range:");
		int hr=sc.nextInt();
		
		int sum=0;
		for (int i=lr;i<=hr;i++)
		{
			boolean isPrime=true;
			for (int j=2;j<=i/2;j++ )
			{
				if (i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime && i>1)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of prime number within a range="+sum);
	}
}
