import java.util.Scanner;
class Armstrong_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		
		int temp=number;
		
		//Count the digits
		int count=0;
		
		while (number!=0)
		{
			count++;
			number=number/10;
		}
		
		//Digits of number
		number=temp;
		int sum=0;
		
		while (number!=0)
		{
			int lastdigit=number%10;
			
			//Power of digits to count
			int power=1;
			
			for (int i=1;i<=count;i++)
			{
				power=power*lastdigit;
			}
			
			//Sum of powers
			sum=sum+power;
			number=number/10;
		}
		//Compare the numbers
		if (sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not an armstrong number");
	}
}
