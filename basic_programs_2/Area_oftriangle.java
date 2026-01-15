import java.util.Scanner;
class Area_oftriangle
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		
		System .out.println("height");
   double height=sc.nextDouble();
   System .out.println("base");
   double base=sc.nextDouble();
    double area_triangleinches=0.5*base*height;
	 double area_trianglecm=6.45f*area_triangleinches;
	 
		
				System .out.println("area_triangle inches"+area_triangleinches);
				System .out.println("area_triangle cm"+area_trianglecm);
				
	}
}