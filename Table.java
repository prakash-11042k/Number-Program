import java.util.Scanner;
class Table 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the table number:");
		int number=sc.nextInt();
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+number+"="+(number*i));
		}
	}
}
