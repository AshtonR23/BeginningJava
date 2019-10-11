/* This is a program that will read two words representing passwords from the keyboard and outputs
the number of characters in the smaller of the two
 */

 import java.util.Scanner;

 public class Assesment1and2 {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.println(" Enter a word into the keyboard to represent your password > ");
   String InputString = input.next();
   int LengthofPas1 = InputString.length();

   System.out.println(" Enter a second word into the keyboard to represent your second password > ");
   String InputString2 = input.next();
   int LengthofPas2 = InputString.length();

   if (LengthofPas1 > LengthofPas2) {
    System.out.print(LengthofPas2);
   } else {
    System.out.print(LengthofPas1);
   }
  }
 }





























