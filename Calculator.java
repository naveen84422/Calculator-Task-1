import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int choice;
		
		while(true)
		{
			System.out.println("1 addition");
			System.out.println("2 subtraction");
			System.out.println("3 multiplication");
			System.out.println("4 division");
			System.out.println("5 exit");
			
			System.out.println("enter your choice"); 	
			choice=scan.nextInt();
			
			switch(choice)
			{
				
				case 1 : 
				{
					System.out.println(addition(a, b));
					break;
				}
				case 2 : 
				{
					System.out.println(subtraction(a, b));
					break;
				}
				case 3 : 
				{
					System.out.println(multiplication(a, b));
					break;
				}
				case 4 : 
				{
					System.out.println(division(a, b));
					break;
				}
				case 5 :
				{
					System.out.println("Exiting...");
					System.exit(0);
					
				}
				default : 
				{
					System.err.println("Invalid input");
				}
			}
		}
			
		
	}
	
	public static int addition(int a,int b)
	{
		return a+b;
	}
	
	public static int subtraction(int a,int b)
	{
		return a-b;
	}
	
	public static int multiplication(int a,int b)
	{
		return a*b;
	}
	
	public static int division(int a,int b)
	{
		return a/b;
	}	

}
