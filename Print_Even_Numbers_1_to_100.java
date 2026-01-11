class Print_Even_Numbers_1_to_100 
{
	public static void main(String[] args) 
	{
		int start=1,end=100;
		
		while (start<=end)
		{
			if (start%2==0)
			{
				System.out.println(start+" ");
			}
			start++;
		}
	}
}
