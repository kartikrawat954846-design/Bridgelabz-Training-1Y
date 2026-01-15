import java.util.Scanner;
class height_tofoot
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("height_cm");
   double height_cm=sc.nextDouble();
   double height_inches=2.54*height_cm;
				System .out.println("height_inches"+height_inches);
				double height_foot=height_inches/12;
				System .out.println("height_foot"+height_foot);
				
	}
}