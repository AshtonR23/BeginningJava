/* this is going to be a program where we replicate a figure of the seattle tower and make it re-sizable

 */


import java.util.*;
public class SeattleTower {

    public static final int SIZE = 4;

    public static void main(String[] args) {

       // polesegment();
        top();
        //spikebase();
       // midsection();
       // top();
    }

  /*  public static void polesegment()
    {
        int pole;
        pole = 4;
        for (int line = 1; line <= pole; line++)
        {
            space(line);
            space(line);
            System.out.println("||");
        }
    }
      /*  public static void top(){
        String space;
         space = (" ");
            for (int line =SIZE -5; line <= SIZE; line++)
            {
                System.out.println(space);
                System.out.print("/||\\");

            }
                int semicolon = 3;
            for ( int dot = 1; dot < semicolon;dot++)
            {
                System.out.print(":::");
            }
      } */



    public static void space(int line)
    {
        for (int space = 1; space <= -2 * line + 2 * SIZE; space++)
        {
            System.out.print(" ");
        }
    }
    public static void top() {
        for (int line = 1; line <= SIZE; line++)
        {

            for (int dot = 1; dot < 2* line - SIZE; dot++)
            {
                space(line);
                space(line);
                System.out.print("__/");
                System.out.print(":");
                System.out.print("||");
                System.out.print(":");
                System.out.println("\\__");
            }

        }
}

}


















