package calculation;

import java.util.Scanner;
public class Calculator{
	public double addition(double x,double y) {
	
	return x+y;
	}
	public double subtraction(double x,double y) {
		
		return x-y;
	}
	public double multiplication(double x,double y) {
		
		return x*y;
	}
	public double division(double x,double y) {
	   return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   float num1;
		   float num2;
		   int choose;
		   int choice;
		   do {
		Scanner input = new Scanner(System.in);
		Calculator object = new Calculator();
		System.out.println("\t"+"\t"+"SIMPLE CALCULATOR!");
		System.out.println("\n"+"\t"+"WELCOME,,,WHAT CALCULATION WOULD YOU LIKE TO DO?");
		System.out.println("\n"+"choice:"+"\n"+"1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplation"+"\n"+"4.Division");
		do
		{
		System.out.print("\n"+"choose : ");
		choose =input.nextInt();
		switch(choose) 
		{
		case 1:
		{
		    System.out.println("\n"+"1.Addition");
		    break;
		}
		case 2:
		{
		    System.out.println("\n"+"2.Subtraction");
		    break;
		}
		case 3:
		{
		    System.out.println("\n"+"3.Multiplication");

		    break;
		}
		case 4:
		{
			System.out.println("\n"+"4.division");

			break;
		}
			default:
			System.out.println("\n"+"Invalid choice!!");
		} 
		}
		while (choose<1||choose>4);


		System.out.print("\n"+"Enter the first number : ");
		 num1 =input.nextFloat();
			System.out.print("\n"+"Enter the second number : ");
			  num2 = input.nextFloat();
			  switch(choose) 
			  {
			  case 1:
			  {
				    System.out.println("\n"+"Addition =" + object.addition(num1,num2));
				    break;
			  }
			  case 2:
			  {
				    System.out.println("\n"+"subtraction = "+ object.subtraction(num1,num2));
				    break;
			  }
			  case 3:
			  {
				    System.out.println("\n"+"multiplication ="+ object.multiplication(num1,num2));
				    break;
			  }
			  case 4:
			  {
				    System.out.println("\n"+"division ="+object.division(num1,num2));
				    break;
			  }
			  }
			  while (choose<1||choose>4);
			  System.out.println("To Start the calculation once again,just enter option 1");
			  System.out.println("\n"+"1.restart");
			  System.out.println("\n"+"choice");
			  choice = input.nextInt();
			  switch(choice)
			  {
			  case 1:
			  {
				  System.out.println("1.restart");   
				  break;
			  }
			  default:
					System.out.println("\n"+"Invalid choice!!");
			  }
		   }
			  
			  
		   while(choice<=1);
}
}