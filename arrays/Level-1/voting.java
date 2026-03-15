import java.util.Scanner;
public class voting{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility Result:");

        
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age");
            }
            else if (age[i] >= 18) {
                System.out.println("Student " + (i + 1) + ": Can vote");
            }
            else {
                System.out.println("Student " + (i + 1) + ": Cannot vote");
            }
        }

        sc.close();
    }
}