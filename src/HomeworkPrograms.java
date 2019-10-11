/*
This code prompts the user for a single character and prints true if that character is a letter and false if it is not a letter



*/
import java.util.Scanner;

public class HomeworkPrograms
{
public static void main (String [] args)
{
   Scanner scan = new Scanner(System.in);
   System.out.print("Enter a character >");
   String character = scan.next();
   char c = character.charAt(0);

   System.out.println( "The character is a number " + c + " is: " + (int)c);
    System.out.println("\n" + c + " is a digit: " + Character.isDigit( c ));
    System.out.println("\n" + c + " is a letter: " + Character.isLetter( c ));
}
}
