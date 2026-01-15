import java.util.Scanner;
class Sum
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("Enter your math marks");
   int maths=sc.nextInt();
   System .out.println("Enter your physics marks");
   int physics=sc.nextInt();
      System .out.println("Enter your chemistry marks");
	  int chemistry=sc.nextInt();
	  

  int average=(maths+physics+chemistry)/3;
		System .out.println("average"+average);
	}
}