import java.util.*;
class X_power_N 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter x value:");
		int x=sc.nextInt();
		System.out.print("\t\t\tEnter n value:");
		int n=sc.nextInt();
		
		int ans=1;
		
		for (int i=1;i<=n;i++)
		{
			ans=ans*x;
		}
		System.out.println("Result:"+ans);
	}
}
