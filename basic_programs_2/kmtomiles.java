import java.util.Scanner;
class kmtomiles
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("kilometer");
   double kilometer=sc.nextDouble();


  double miles=kilometer*1.6;
				System .out.println("miles"+miles);
	}
}