import java.util.*;
class Print_One_to_N_Numbers 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter n value:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) //if(i%2==0) -> This condition only for 1 to N even numbers
		{
			System.out.println(i+" ");
		}
	}
}
