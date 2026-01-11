class Swap_Two_Numbers_with_Temp 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		System.out.println("Before swapping:");
		System.out.println("a="+a+"b="+b);
		
		int temp=a;
		
		a=b;
		b=temp;
		
		System.out.println("\nAfter swapping:");
		System.out.println("a="+a+"b="+b);
	}
}
