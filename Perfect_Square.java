import java.util.Scanner;
class Perfect_Square 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
		
		String ans="No";
		
		for (int i=1;i*i<=number;i++)
		{
			if (number==i*i)
			{
				ans="Yes";
				break;
			}
		}
		System.out.println(ans);
	}
}
