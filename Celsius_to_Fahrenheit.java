import java.util.*;
class Celsius_to_Fahrenheit
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the celsius:");
		double celsius=sc.nextInt();
		
		double fahrenheit=(celsius*9)/5+32;
		System.out.println("Fahrenheit:"+fahrenheit);
	}
}
