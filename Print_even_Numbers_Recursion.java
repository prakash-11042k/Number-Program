class Print_even_Numbers_Recursion 
{
	static int n=2;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		evennum(2);
		System.out.println("End");
	}
	public static void evennum(int number)
	{
	if(n<=100)
    {
		System.out.println(n);
		n+=2;
		evennum(number);
	}
	}	
}
