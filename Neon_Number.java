import java.util.Scanner;
class Neon_Number 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		int total=0;
		sum+=(num)*(num);
		
		while (sum>0)
		{
			int last=sum%10;
			total=total+last;
			sum=sum/10;
		}
		if (temp==total)
		{
			System.out.println("it is neon");
		}
		else
			System.out.println("it is not neon");
	}
}

/* number=9 -> 9squre(9*9)=81 -> 8+1=9(number=9) -> so it is neon */
