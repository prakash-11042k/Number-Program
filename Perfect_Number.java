import java.util.*;
class Perfect_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isPerfect(int number) 
	{
		int sum=0;
		for (int i=1;i<=number/2;i++)
		{
			if (number%i==0)
				sum=sum+i;
		}
		return number==sum;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter Number:");
		int number=sc.nextInt();
		if (isPerfect(number))
		{
			System.out.println("Perfect Number");
		}
		else
			System.out.println("Not perfect number");
	}	
}

/*Perfect number is 6,28,4968*/
