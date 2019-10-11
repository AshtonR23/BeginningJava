/*
This will be a program that ask a user for their first name, then tells the user how many characters are in their name. It will then ask the user for their data of birth
and calculate their date of birth. Using this, tell the user the percentage of their life lived of their expected life. Lastly, the program will
have the user guess a random number between 1 and 20, and the user willl be given 3 tries to guess correctly
 */

import java.util.*;

public class NameAndNumberGuess
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* This part of the code will prompt the user for their name */

       String userName;
        System.out.println(" Hello, what is your name? <");
        userName = scan.next();
        System.out.println(" Hello " + userName);

        /* this part will scan the users name and find the amount of characters in the name, and then return that value to the user */
        int nameLength = userName.length();
        System.out.print("There are " + nameLength + " characters in your name");
        System.out.println();

/* This part will prompt the user for the year they were born in, and then figure out how old they are by subtracting the current year by
their birthyear */


        Scanner birthyear = new Scanner(System.in);

        System.out.print("What year were you born in?");

        int birthYear;
        int age;
        birthYear = scan.nextInt();
        int SimpleDate = 2019;
        age = (SimpleDate - birthYear);
        System.out.print(" You are " + age + " years old this year");
        System.out.println();
        /* This part will take the users age as found from the part above, and calculate the percentage of their expected life and return that value */
        double lifeexp = 78.94;
        double lifelived;
        double percentagelife;
        lifelived = (age / lifeexp);
        percentagelife = (lifelived * 100);


        System.out.println("You have lived about " + (lifelived) + " % of your life so far");


/* This part will generate a random number and ask the user to guss the number. The user will get 3 tries, and after those three tries,
the user will given how far away from the number they are */

        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        Scanner a = new Scanner(System.in);
        System.out.println("You will now have three tries to guess a random number between 0 and 20 ");

        System.out.print("enter a number");

        int guess = a.nextInt();
        int guess2;
        int guess3;

        for( int x = 0; x<3; x++)
        {
            if (guess == randomNumber)
            {
                System.out.println("Congrats you guessed the number!");
            }
            else{
                System.out.println("Try again");
                Scanner b = new Scanner(System.in);
                 guess2 = b.nextInt();
                if (guess2 == randomNumber)
                {
                    System.out.println("Congrats you guessed the number!");
                }
                else {
                    System.out.println("Try again");
                    Scanner c = new Scanner(System.in);
                     guess3 = c.nextInt();
                    if (guess3 == randomNumber)
                    {
                        System.out.println("Congrats you guessed the number!");
                    }
                        else{
                            System.out.println("Sorry you were not able to guess the number correctly in 3 tries, the number was " + randomNumber);
                            System.out.print("You were " + (guess3 - randomNumber) + " digits away from the right number");
                    }
                }
            }
        }

    }

}
