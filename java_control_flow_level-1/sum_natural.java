import java.util.Scanner;
class sum_natural
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in); 
		System .out.println("enter number ");
   int n=sc.nextInt();
 if(n>0){
	 int sum=n*(n+1)/2;
 System.out.println("the number is natural number"+sum);}
	 else{
		  System.out.println("the number is not natural number");
	 }
 
		
	}
}