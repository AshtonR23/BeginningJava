
import java.util.*;

public class HomeworkProblems {
    public static void main(String[] args) {

        System.out.println("Please enter a guess for a random number between 1-50");
        Random random = new Random();
        int secretnumber = random.nextInt(50) + 1;

        Scanner guess = new Scanner(System.in);
        int guess1;
        guess1 = guess.nextInt();
        if ( guess1<1 && guess1>50){
            System.out.println("Sorry that is not a valid guess, try again");
        }
        else if(guess1==secretnumber)
        {
            System.out.println("Congratulations you guessed it");
        }
        else {
            System.out.println("Sorry you guessed incorrectly, try again");
        }
            Scanner guess2 = new Scanner(System.in);
            int guessagain;
            guessagain = guess2.nextInt();

        if(guessagain == secretnumber)
        {
            System.out.println("Congratulations you guessed it");
        }
        else {
            System.out.println("Sorry you guessed incorrectly, try again");
        }
        Scanner guess3 = new Scanner(System.in);
        int guessagain2;
        guessagain2 = guess2.nextInt();

        if(guessagain2 == secretnumber)
        {
            System.out.println("Congratulations you guessed it");
        }
        else if(guessagain2 == secretnumber +3 || guessagain2 == secretnumber-3) {
            System.out.println("You missed by a mile");
        }
        else{
                System.out.println("You were close");
            }
                System.out.println("Better Luck Next Time");
        System.out.println("The number was " + secretnumber);
        }
    }















