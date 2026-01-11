class Print_A_to_Z_Recursion 
{
	public static void main(String[] args) 
	{
		atoz('A');
	}
	public static char atoz(char ch)
	{
		if (ch<='Z')
		{
			System.out.println(ch+" ");
			ch++;
			atoz(ch);
		}
		return ch;
	}	
}
