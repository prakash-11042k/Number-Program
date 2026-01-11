import java.util.Scanner;
class Count_the_Digits 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");
		int number=sc.nextInt();
		
		int count=0;
		
		if (number==0)
		{
			count=1;
		}
		else 
		{
			while (number>0)
			{
				number=number/10;
				count++;
			}
		}
		System.out.println("Toatal digit:"+count);
	}
}
