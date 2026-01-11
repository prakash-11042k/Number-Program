import java.util.Scanner;
class Tables_in_Range 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.print("Enter start:");
		int start=sc.nextInt();
		System.out.print("Enter end:");
		int end=sc.nextInt();
		printTables(start,end);
	}
	public static void printTables(int start,int end)throws Exception
	{
		for (int i=1;i<=10;i++)
		{
			for (int j=start;j<=end;j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
				Thread.sleep(50);
			}
			System.out.println();
		}
	}
}
