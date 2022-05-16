package Functions;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int org = 1;
        int orgface = 0;
        int inv = 0;
        while ( n != 0 ){
            orgface = n%10;
            int iplace = orgface;
            int iface = org;
            inv = inv + iface * (int)(Math.pow(10, iplace-1));
            n = n/10;
            org = org + 1;


        }

        System.out.println (inv);

    }
}
