import java.util.Scanner;
class earthvolume
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("radius of earth");
   double radius=sc.nextDouble();
   double pi=3.14;
  double volumeofearth=(4/3)*pi*radius*radius*radius;

				System .out.println("volumeofearth"+volumeofearth);
	}
}