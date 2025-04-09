import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Really Prime Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int step = 0;

        if (number <= 1) {
            System.err.println("Illegal Argument");
            System.exit(-1);
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            step++;
            if (number % i == 0) {
                System.out.println("false " + step);
                return;
            }
        }

        System.out.println("true " + step);
    }
}
