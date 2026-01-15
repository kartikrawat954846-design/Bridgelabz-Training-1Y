import java.util.Scanner;
class calculator
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("Enter number 1");
   float number1=sc.nextFloat();
   		System .out.println("Enter number 2");
				float number2=sc.nextFloat();
				float addition =number1+number2;
				float subtraction=number1-number2;
				float multiplication=number1*number2;
				float division=number1/number2;
				
				System .out.println("addition"+addition);
				System .out.println("subtraction"+subtraction);
				System .out.println("multiplication"+multiplication);
				System .out.println("division"+division);
				
				sc.close();
	}
}