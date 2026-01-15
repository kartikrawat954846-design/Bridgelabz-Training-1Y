import java.util.Scanner;
class student
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("student");
   int student=sc.nextInt();

   System .out.println("totalpen");
   int totalpen=sc.nextInt();
   int penperstudent =totalpen/student;
   int remainingpen=totalpen%student;
   
				System .out.println("penperstudent"+penperstudent);
				System .out.println("remainingpen"+remainingpen);
	}
}