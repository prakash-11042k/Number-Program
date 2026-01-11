import java.util.*;
class Leap_Year 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the year:");
		int year=sc.nextInt();
		
		if (findLeapyear(year))
		{
			System.out.println("This year"+year+"is leap year");
		}
		else
			System.out.println("This year"+year+"is not leap year");
	}
	public static boolean findLeapyear(int year)
	{
		if (year%400==0 || year%4==0 && year%100!=0)
		{
			return true;
		}
		return false;
	}
}
