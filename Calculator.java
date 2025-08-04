import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter first no");
		float a=scan.nextFloat();
		System.out.println("enter second no");
		float b=scan.nextFloat();
		
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
	
	public static float addition(float a,float b)
	{
		return a+b;
	}
	
	public static float subtraction(float a,float b)
	{
		return a-b;
	}
	
	public static float multiplication(float a,float b)
	{
		return a*b;
	}
	
	public static float division(float a,float b)
	{
		return a/b;
	}	

}

