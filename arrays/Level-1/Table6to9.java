public class Table6to9 {
    public static void main(String[] args) {
        int[] multiplicationResult = new int[4 * 10]; // 4 numbers * 10 results
        int index = 0;

        for (int number = 6; number <= 9; number++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[index] = number * i;
                System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
                index++;
            }
        }
    }
}