import java.util.Scanner;
class The_Even_Number_Sum_and_Odd_Number_DigitalProduct
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\tEnter the start:");
		int start=sc.nextInt();
		System.out.print("\t\t\tEnter the end:");
		int end=sc.nextInt();
		
		for (int i=start;i<=end;i++)
		{
			int number=i;
			if (number%2==0)
			{
				//Even <Digital sum>
				int ans=0;
				while (number>0)
				{
					ans=ans+number%10;
					number=number/10;
				}
				System.out.print(ans+" ");
			}
			else
			{
				//odd <Digital product>
				int ans=1;
				while (number>0)
				{
					ans=ans*number%10;
					number=number/10;
				}
				System.out.print(ans+" ");
			}
		}
	}
}

/*
 Enter the start:21
 Enter the end:30
 
 2 4 6 6 0 8 4 10 8 3 ->21(2*1=2) 22(2+2=4) 23(2*3=6) 24(2+4=6) 25(2*5=10(0)) 26(2+6=8) 27(2*7=14(4)) 28(2+8=10) 29(2*9=18(8)) 30(3+0=3)
 
*/
