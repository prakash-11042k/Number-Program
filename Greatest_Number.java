import java.util.*;
class Greatest_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter a number 1:");
		int a=sc.nextInt();
		
		System.out.print("\t\t\tEnter a number 2:");
		int b=sc.nextInt();
		
		System.out.print("\t\t\tEnter a number 3:");
		int c=sc.nextInt();
		
		int res=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Greatest Number is:"+res);
	}
}

