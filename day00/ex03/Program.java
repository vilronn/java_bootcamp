import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int i = 1, n, minWeek, glob = 0, week, minEvrWeek;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while (!str.equals("42") && i <= 18) {
            minWeek = 9;
            if (str.equals("Week") && sc.nextInt() == i) {
                for (int j = 0; j < 5; j++) {
                    n = sc.nextInt();
                    if (n > 0 && n < 10) {
                        if (n < minWeek)
                            minWeek = n;
                    } else {
                        System.err.println("Illegal Argument");
                        System.exit(-1);
                    }
                }
            } else {
                System.err.println("Illegal Argument");
                System.exit(-1);
            }
            glob = glob * 10 + minWeek;
            i++;
            str = sc.next();
        }

        week = i - 1;
        for (int j = 1; j <= week; j++) {
            System.out.printf("Week %d ", j);
            minEvrWeek = (int) (glob/Math.pow(10, (week - j)));
            glob = (int) (glob - minEvrWeek * Math.pow(10, week - j));
            while (minEvrWeek > 0) {
                System.out.print("=");
                minEvrWeek--;
            }
            System.out.println(">");
        }
    }
}

