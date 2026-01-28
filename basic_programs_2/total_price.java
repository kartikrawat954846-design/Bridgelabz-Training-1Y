import java.util.Scanner;
class total_price
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("unit_price");
   double unit_price=sc.nextDouble();
   System .out.println("quantity");
   double quantity=sc.nextDouble();
    
	 double final_amount=unit_price*quantity;
	  
System .out.println("final_amount_amount_amount"+final_amount);
		
	}
}