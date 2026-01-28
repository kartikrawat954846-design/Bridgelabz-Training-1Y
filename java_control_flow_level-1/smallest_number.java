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
	  if(number1<number2&&number1<number3){
	  System.out.println("yes");}
	  else {
	  System.out.println("no");
	  }
		
	}
}