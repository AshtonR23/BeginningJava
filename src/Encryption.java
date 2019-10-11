/*
Ashton Rischer
10/1/19
This is a program that will read an encrypted sentence , and output the sentence
*/
import java.util.*;



public class Encryption {

    public static void main (String [] args) {

        Random random = new Random();
        Scanner phrase = new Scanner(System.in);
        System.out.println("Enter the phrase that you would like to encrypt");
        String phraseinput = phrase.nextLine();

        System.out.println("Enter a key for how many digits you would like in between your encrypted message");
        Scanner keyinput = new Scanner(System.in);
        int key = keyinput.nextInt();

        int phraseLength = phraseinput.length();

        String printString ="";
        for(int x = 0; x < phraseLength; x++);
        {
            for(int y=0; y < key;y++ )
            {
                int rand = random.nextInt(94)+33;
                char RandomChar = (char)rand;
                printString = printString + (RandomChar);
            }
            System.out.print(printString);
        }













    }
}















































/*
import java.util.*;


public class Encryption {


    public static void main (String [] args) {

        Scanner Sentencescan = new Scanner(System.in);
        /* The user will input what their key is here */

  /*      Scanner Key = new Scanner(System.in);
        System.out.print("Please enter a key for how many digits you want as your key");
        int KEY;
        KEY = Key.nextInt();

        /* The user will input their phrase here */
   /*     System.out.print("Please enter a phrase ");
        String Sentence;
        Sentence = Sentencescan.next();
        /* The program will scan the length of the sentence here */

  /*      int SentenceLength;
        SentenceLength = Sentence.length();
        /* The program will store each letter of the sentence as an index value here */

    /*    Sentence = Sentencescan.next();
        for (int index = 0; index < Sentence.length(); index++);


    }

}
*/





