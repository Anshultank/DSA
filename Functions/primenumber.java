package Functions;

import java.util.*;

class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        int lv = 1;
        while (lv <= t) {

            int n = scn.nextInt();

            int fac = 2;
            int count = 0;

            while (fac <= (n - 1)) {
                if (n % fac == 0) {
                    count = count + 1;
                }
                fac = fac + 1;
            }
            if (count == 0) {
                System.out.println("prime");

            } else {

                System.out.println(" not prime");
            }

            lv = lv = 1;
        }
    }}