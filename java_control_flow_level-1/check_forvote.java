import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of terms

        int a = 0, b = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = a + b;

            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

	}
