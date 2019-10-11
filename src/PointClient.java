/*
My client Point Class
Ashton Rischer
9/25/19
 */
import java.util.Scanner;

public class PointClient {


    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        Point p1 = new Point(num1,num2 );
        Point p2 = new Point(num2,num1 );

        num1 = input.nextInt();
        num2 = input.nextInt();

        Point p3 = new Point(num1,num2);

        p1.modify(3);
        p2.setX(7);
        p2.setY(8);

        System.out.println("Point 1 = " + p1.toString());
        System.out.println("Point 2 = " + p2.toString());
        System.out.println("Point 3 = " + p3.toString());

        double distance = p1.distance(p2);
        System.out.printf("Distance = %10.2f", distance);

    }

}


//* create a distance method
//* double distance = Math.sqrt(Math.pow((p1.x-p2.x),2) + (Math.pow((p1.y-p2.y),2);
//*
