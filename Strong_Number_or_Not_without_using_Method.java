import java.util.Scanner;
class Strong_Number_or_Not_without_using_Method 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		
		int sum=0;
		int temp=number;
		
		while (number>0)
		{
			int lastdigit=number%10;
			int ans=1;
			
			for (int i=lastdigit;i>=2;i--)
			{
				ans=ans*i;
			}
			sum=sum+ans;
			number=number/10;
		}
		if (temp==sum)
			System.out.println("Strong number");
		else
			System.out.println("Not a strong number");	
	}
}
