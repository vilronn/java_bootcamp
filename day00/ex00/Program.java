public class Program {
    public static void main(String[] args) {
        int num = 470598;
        int sum = 0;

        if (num > 99999 && num <= 999999) {
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            System.out.println("Sum of Digits: " + sum);
        }
    }
}
