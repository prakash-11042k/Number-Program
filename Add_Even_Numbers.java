import java.util.Scanner;
class Add_Even_Numbers 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		int number=sc.nextInt(),sum=0;
		
		while (number>0)
		{
			int last=number%10;
			
			if (last%2==0)
			{
				sum=sum+last;
			}
			number/=10;
		}
		System.out.println("Total even digits sum:"+sum);
	}
}
