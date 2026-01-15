import java.util.Scanner;
class fees
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("coursefees");
   int coursefees=sc.nextInt();

   System .out.println("discount");
   int discount=sc.nextInt();
   int discountedamount =(coursefees/100)*discount;
   int remainingfees=coursefees-discountedamount;
   
				System .out.println("discountedamount"+discountedamount);
				System .out.println("remainingfees"+remainingfees);
	}
}