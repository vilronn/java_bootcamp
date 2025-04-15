import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chaArr = sc.next().toCharArray();
        int[] alphabet = new int[65535];
        int[][] top = new int[10][2];
        int[][] matrix = new int[10][12];
        int i = 0, percent;
        while (chaArr.length > i) {
            alphabet[chaArr[i]]++;
            i++;
        }
        for (int n = 0; n < 10; n++) {
            for (int j = 0; j < 65535; j++) {

                if (alphabet[j] > top[n][1]) {
                    top[n][1] = alphabet[j];
                    top[n][0] = j;
                }
            }

            alphabet[top[n][0]] = 0;
        }
        for (int l = 0; l < 12; l++) {

            for (int k = 0; k < 10; k++) {
                percent = 10 * top[k][1] / top[0][1];
                if (l == 11) {
                    System.out.printf("%c\t", top[k][0]);

                } else if (l > (10 - percent)) {
                    System.out.printf("%c\t", '#');

                } else if (l == (10  - percent)){
                    System.out.printf("%d\t", top[k][1]);

                } else {
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");

        }
    }
}

