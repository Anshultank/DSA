package Pattern;
import java.util.Scanner;
public class Pattern3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j =1 ; j<= n-i; j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= m; j++) {
              if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            } System.out.println();
        }

    }}