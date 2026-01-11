import java.util.Scanner;
class Grade 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the mark:");
		int mark=sc.nextInt();
		
		if (mark>100 || mark<0)
		{
			System.out.println("Invalid");
		}
		else if (mark>=90)
		{
			System.out.println("A grade");
		}
		else if (mark>=70)
		{
			System.out.println("B grade");
		}
		else if (mark>=35)
		{
			System.out.println("C grade");
		}
		else if (mark>=0)
		{
			System.out.println("Fail");
		}
	}
}
