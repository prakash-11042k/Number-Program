class Fizz_Buzz_Recursion 
{
	public static void main(String[] args) 
	{
		fizzbuzz(1);
	}
	public static void fizzbuzz(int num){
		if (num<=100)
		{
			if (num%3==0 && num%5==0)
			{
				System.out.println("fizzbuzz");
			}
			else if (num%3==0)
			{
				System.out.println("fizz");
			}
			else if (num%5==0)
			{
				System.out.println("buzz");
			}
			else
				System.out.println(num);
			num++;
			    fizzbuzz(num);
		}
	}	
}
