import java.util.*;
class Happy_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the number:");
		int number=sc.nextInt();
		
		int sum=0;
		
		while (number!=1 && number!=4)
		{
			while (number>0)
			{
			    sum=sum+(number%10)*(number%10);
			    number=number/10;
			}//Inner loop exit point
			 //Change the given number
			number=sum;
			sum=0;
		}//Outer loop exit point
		 
	    if (number==1)
		    System.out.println("Happy number");
	    else if (number==4)
			System.out.println("Unhappy number");
	}	
}
