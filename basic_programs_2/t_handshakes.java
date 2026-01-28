import java.util.Scanner;
class t_handshakes
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("enter no of student");
   double enterno_of_students=sc.nextDouble();
    
	 double total_handshakes=(enterno_of_students*(enterno_of_students-1))/2;
	  
System .out.println("final handshake"+total_handshakes);
		
	}
}