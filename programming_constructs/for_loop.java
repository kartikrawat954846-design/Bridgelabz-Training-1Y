import java.util.Scanner;
class for_loop
{
	public static void main (String args [])
	{
		
		Scanner sc = new Scanner(System.in);
			for(int i=0;i<=10;i++)
		System .out.println("enter no of marks");
   int marks=sc.nextInt();
   
   if(marks<50){
   System.out.println("fail");}
	      else if(marks<=50&&marks<=60){
		  System.out.println("E");}
		   else if(marks<=60&&marks<=70){
		  System.out.println("D");}
		   else if(marks<=70&&marks<=80){
		  System.out.println("C");}
		   else if(marks<=80&&marks<=90){
		  System.out.println("B");}
		  else if(marks<=90&&marks<=100){
		  System.out.println("A");}
		  
	}  	  
	   
   }