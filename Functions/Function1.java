package Functions;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Function1 {



    //    Example 1
//    public static void printName(String name){
//        System.out.println(name);
//        return;
//    }
////    ----------->function printing name
//
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//String name = sc.next();
//printName(name);  //called function
//    }




//    Example 2
//    public static int twoSum(int a ,int b){
//        int sum = a+b;
//        return sum;
//    }
//    public static void main(String args[]){
//        Scanner scn = new Scanner(System.in);
//        int a  = scn.nextInt();
//        int b = scn.nextInt();
//
//        int sum = twoSum(a,b);
//        System.out.println("Sum of two number is : " + sum);
//    }



//          Example 3
    public static int multiply(int a ,int b){
        return a*b;
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Product of two number is : " + multiply(a, b));
    }
}



