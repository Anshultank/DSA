package Pattern;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("\t");
            }
            System.out.println("*\t");

        }
        System.out.println();
    }
}
