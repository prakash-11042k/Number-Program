class Xylem_Number_or_Not 
{
	public static boolean xylem(int num) 
	{
		int temp=num;
		int sum=0;
		int sum1=0;
		int total=0;
		int last=num%10;
		
		while (num>9)
		{
			num=num/10;
		}
		sum=num+last;
		
		while (temp>0)
		{
			int digit=0;
			digit=temp%10;
			sum1=sum1+digit;
			temp=temp/10;
		}
		total=sum1-sum;
		return total==sum;
	}
	public static void main(String[]args)
	{
		int num=612344;
		if (xylem (num))
		{
			System.out.println(num+"is a xylem");
		}
		else
			System.out.println(num+"is not a xylem");
	}
}
/* 612344 ->  6____4=10  -> is a xylem   
              _1234_=10
   
   Sum of First and Last = Middle */   
      