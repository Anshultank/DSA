package Functions;

import java.util.*;

public class fibonacci{

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int a=0;
        int b=1;
        int lv = 0;
        while (lv <= n){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
         lv = lv + 1;
}}}
