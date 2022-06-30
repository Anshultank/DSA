//get bit
import java.util.*;
public class bitManipulation {
  public static void main(String args[]){
    int n = 3;
    int pos = 2;
    int bitMask = 1<<pos;
    
    if ((bitMask & n) == 0); {
    System.out.println("bit is zero");
    }else{
      System.out.println("bit is one");
  }}}


//set bit
import java.util.*;
public class bitManipulation {
  public static void main(String args[]){
    int n = 3;
    int pos = 2;
    int bitMask = 1<<pos;
    
    int new = bitMask | n;
    System.out.println(new);
  }}


//clear bit 
import java.util.*;
public class bitManipulation {
  public static void main(String args[]){
    int n = 3;
    int pos = 2;
    int bitMask = 1<<pos;
    int notBit = ~(bitMask);
    
    int new = notBit & n;
    System.out.println(new);
  }}


//update bit
//for 0 -> clear bit   and   for 1 -> set bit operation
import java.util.*;
public class bitManipulation {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int opr = sc.nextInt();
   
    int n = 3;
    int pos = 2;
    int bitMask = 1<<pos;
    if (opr == 1);{
      int new = bitMask | n;
      System.out.println(new);
    }else{
      int newBit = ~(bitMask);
      int new = newBit & n;
      System.out.println(new);
    }}}
