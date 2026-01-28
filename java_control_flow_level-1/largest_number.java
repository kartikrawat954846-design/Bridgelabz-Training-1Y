import java.util.Scanner;
class smallest_number
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("enter number 1");
   int number1=sc.nextInt();
   System .out.println("enter number 2");
   int number2=sc.nextInt();
   System .out.println("enter number 3");
   int number3=sc.nextInt();
	  if(number1>number2&&number1>number3){
	  System.out.println("largest number1");}
	  	 else if(number2>number3&&number2>number3){
	  System.out.println("largest number2");}
	  else if(number3>number1&&number3>number2){
	  System.out.println("largest number3");}
		
	}
}