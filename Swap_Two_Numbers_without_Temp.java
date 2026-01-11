class Swap_Two_Numbers_without_Temp 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		System.out.println("Before swapping:");
		System.out.println("a="+a+"b="+b);
		
		a=a+b;//a=30
		b=a-b;//b=10
		a=a-b;//a=20
		
		System.out.println("\nAfter swapping:");
		System.out.println("a="+a+"b="+b);
	}
}
