import java.util.Scanner;
class divisibleby_5
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("enter number");
   int number=sc.nextInt();
	  if(number%5==0){
	  System.out.println("divisible");}
	  else {
	  System.out.println("not divisible");
	  }
		
	}
}