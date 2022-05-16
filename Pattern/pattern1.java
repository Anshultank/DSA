package Pattern;
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
//        upper
                for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//lower
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }


            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
