import java.util.*;
class Sum_of_N_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(i+" ");
		}
		System.out.println("Sum of Value:"+sum);
	}
}
