import java.util.Scanner;
class Guess_the_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag=true;
		int sys_number=(int)(Math.random()*100);
		
		do
		{
			System.out.println("\t\t\tGuess the number");
			System.out.print("Enter your Guess:");
			int Guess_number=sc.nextInt();
			
			if (sys_number>Guess_number)
			{
				System.out.println("Low");
			}
			else if (sys_number<Guess_number)
			{
				System.out.println("High");
			}
			else{
				System.out.println("Congraulations");
				System.out.print("Do you want to continue Y/N:");
				char con=sc.next().charAt(0);
				
				if (con=='Y')
				{
					sys_number=(int)(Math.random()*100);
				}
				else
					flag=false;
			}
				
		}
		while (flag);
		{
			System.out.println("Thanks for playing");
		}
	}
}
