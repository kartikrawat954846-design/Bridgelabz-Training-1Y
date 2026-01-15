import java.util.Scanner;
class distance
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("enter distance_in_feet");
   double distance_in_feet=sc.nextDouble();
   
double distanceinyards=distanceinfeet/3;
double distanceinMiles=distanceinyards/1760;
	  
System .out.println("distance in feet"+distanceinfeet);
System .out.println("distance in yards"+distanceinyards);
System .out.println("distance in miles"+distanceinmiles);



  
		
	}
}