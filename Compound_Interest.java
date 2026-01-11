import java.util.*;
class Compound_Interest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the principle amount:");
		double principle=sc.nextInt();
		
		System.out.print("Enter the rate of interest (in percentage):");
		double rate=sc.nextInt();
		
		System.out.print("Enter the time total duration (in years):");
		double time=sc.nextInt();
		
		//Compound Interest=Priciple*((1+Rate/100)^Time)-Principle
		//CI=(P*1+R/100^T)-P
		
		double CI=(principle*(Math.pow(1+rate/100,time)))-principle;
		
		System.out.println("The total compound interest amount (in 2 years):"+CI);
	}
}
