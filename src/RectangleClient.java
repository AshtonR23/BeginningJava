/*
Ashton Rischer
10/3/19
This will be a program that takes 2 points given by the user, and creates and prints a rectangle using those points.
 */

import java.util.*;

public class RectangleClient{

    public static void main (String [] args)
        {

            System.out.println("Enter a x value for your first point");

            Scanner scan = new Scanner(System.in);
            int userpointx;
             userpointx = scan.nextInt();

            System.out.println("Enter a y value for your first point");

            Scanner b = new Scanner(System.in);
            int userpointy;
            userpointy = b.nextInt();

            System.out.println("Enter a x value for your second point");

            Scanner a = new Scanner(System.in);
            int userpointx2;
            userpointx2 = a.nextInt();

            System.out.println("Enter a y value for your second point");

            Scanner c = new Scanner(System.in);
            int userpointy2;
            userpointy2 = c.nextInt();

       int Height;
       int width;

       Height = userpointy - userpointy2;
       width = userpointx - userpointx2;

       for ( int line = 0; line< Height; line++)
       {
           System.out.println("|");

       }

       for (int dash = 0; dash<width; dash++)
       {
           System.out.print("-");
       }

       for ( int space = 0; space<width; space++)
       {
           System.out.println(" ");
       }
            for (int dash2 = 0; dash2<width; dash2++)
            {
                System.out.print("|");
            }







        }




}
