public class NumberChecker3 {
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] rev = reverseDigits(digits);
        return arraysEqual(digits, rev);
    }

    public static boolean isDuck(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 707;
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Duck number? " + isDuck(num));
    }
}