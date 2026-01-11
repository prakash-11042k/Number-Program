import java.util.Scanner;
class Reverse_the_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int number=sc.nextInt();
		
		int rev=0;
		
		while (number!=0)
		{
			int lastdigit=number%10;
			rev=rev*10+lastdigit;
			number=number/10;
		}
		System.out.println("Reverse:"+rev);
	}
}
