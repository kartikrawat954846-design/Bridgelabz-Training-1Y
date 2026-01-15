import java.util.Scanner;
class Harry
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("Enter birthyear");
   int birthyear=sc.nextInt();
   System .out.println("enter currentyear");
  int currentyear=sc.nextInt();

  int age=currentyear-birthyear;
		System .out.println("age is"+age);
	}
}