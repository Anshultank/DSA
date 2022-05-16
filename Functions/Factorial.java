package Functions;
import java.util.Scanner;
public class Factorial {

    public static void factorial(int a){
        if(a<0){
            System.out.println("invalid number");
            return;
        }
        int fact = 1;
        for (int i=a;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }


    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        factorial(n);
    }

}
