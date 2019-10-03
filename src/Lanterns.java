/* Ashton Rischer
9/22/19
This will be a program that prints out a Lantern shape using methods
 */
public class Lanterns {

    public static final int SIZE = 4;

    public static void main(String[] args) {
        lantern();
        lantern2();
        lantern3();
        row();
        slashrow();
    }

    public static void lantern()
    {
       System.out.println("    *****");
       System.out.println("  *********");
       System.out.println("*************");
       System.out.println("             ");
    }
    public static void lantern2()
    {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }

    public static void slashrow()
    {
        System.out.println("* | | | | | *");
    }
    public static void row()
    {
        System.out.println("*************");
    }
    public static void lantern3()

{
    System.out.println("    *****");
    System.out.println("  *********");
    System.out.println("*************");
}



}





