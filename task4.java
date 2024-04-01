import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean isPowerOfTwo = checkPowerOfTwo(n);
        System.out.println(isPowerOfTwo);
    }

    public static boolean checkPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
