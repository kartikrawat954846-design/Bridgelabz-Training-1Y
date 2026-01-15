import java.util.Scanner;
class Profit
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("Enter your cp");
   int cp=sc.nextInt();
   System .out.println("Enter your sp");
   int sp=sc.nextInt();
int profit =sp-cp;
	  
System .out.println("profit"+profit);
  int profitpercent =(profit*100)/cp;

		System .out.println("profitpercent"+profitpercent);
		
	}
}