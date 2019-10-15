/* this is going to be a program where we replicate a figure of the seattle tower and make it re-sizable

 */


import java.util.*;
public class SeattleTower {

    public static final int SIZE = 4;

    public static void main(String[] args) {

        polesegment();
        top();
        base();
       polesegment();
        midsection();
        top();
    }


  //This method will print the "poles" at the top based on the size
  public static void polesegment()
    {
        for (int line = SIZE; line > 0; line--)
        {
            for (int space = 0; space<SIZE*3; space++)
            {
                System.out.print(" ");
            }
            System.out.print("||");
            System.out.print('\n');
        }
    }
    //This method will print the pyramid structure at the top based on the size
        public static void top()
        {
            for (int line = SIZE * 2; line > -SIZE; line -= 3) {
                Spaces(line);
                ColonPyramid(line);
                System.out.print('\n');
            }
            Line();
        }
        //This method will print the base part underneath the pyramid structure based on the size

        public static void base()
        {
            for(int line = SIZE+1; line>-2; line-=2)
            {
                for (int space = -1; space<SIZE-line;space++)
                {
                    System.out.print(" ");
                }
                System.out.print("\\_");
                for(int b = 0; b<SIZE*2+line-2;b++)
                {
                    System.out.print("/\\");
                }
                System.out.print("_/");

                System.out.print('\n');
            }
        }
        //This section will print the long midsection of the tower based on the size
  public static void midsection(){
        for ( int line = 0;line<SIZE*4;line++)
        {
            for(int space = SIZE*3-3 ;space<(SIZE*4)+2*(SIZE/4);space++)
            {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }

//This is a separate method that will be called within a larger method

    public static void ColonPyramid(int line)
    {
        for (int colon = 0; colon <(SIZE*2-line); colon++)
        {
            System.out.print(":");
        }
        System.out.print("||");
        for (int colon = 0; colon <(SIZE*2-line); colon++)
        {
            System.out.print(":");
        }
        System.out.print("\\__");
    }
//This is a method that controls the number of spaces printed before the top of the pyramid begins printing on each line
    public static void Spaces(int line)
    {
        for (int space = 3; space<line+SIZE; space++)
        {
            System.out.print(" ");
        }
        System.out.print("__/");
    }
//This is a method that prints the lines in the middle of the pyramid
    public static void Line()
    {
        System.out.print("|");
        for (int x = 0; x<SIZE*6;x++)
        {
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.print('\n');
    }


}



