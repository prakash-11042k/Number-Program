import java.util.*;
class Find_Letter_or_Number_or_Special_Character
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter:");
		char a=sc.next().charAt(0);
		
		if (a>='a' && a<='z' || a>='A' && a<='Z')
		{
			System.out.println("LETTER");
		}
		
		else if (a>='0' && a<='9')
		{
			System.out.println("NUMBER");
		}
		
		else
			System.out.println("SPECIAL CHARACTER");
	}
}
