import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int coffeeCount = 0;
        Scanner scanner = new Scanner(System.in);
        int number;

        while ((number = scanner.nextInt()) != 42) {
            if (isPrime(sumDigits(number))) {
                coffeeCount++;
            }
        }

        System.out.println("Count of coffee-request – " + coffeeCount);
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
