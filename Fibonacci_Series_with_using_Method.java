import java.util.*;
class Fibonacci_Series_with_using_Method 
{
	public static void fibo(int n) 
	{
		int n1=0,n2=1,n3=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}	
		
	}
	public static void main(String[] args)
	{
		fibo(10);
	}	
}

/*import java.util.*; //It is used to get the user
  class fibonacci
  {
	  static Scanner sc=new Scanner(System.in);
	  public static void main(String[]args)
	  {
		  System.out.print("Enter Number:");
		  int n=sc.nextInt();
		  
		  int n1=0,n2=1,n3=0;
		  for(int i=1;i<=n;i++)
		  {
			  System.out.print(n3+" ");
			  n1=n2;
			  n2=n3;
			  n3=n1+n2;
		  }
	  }
  }*/
