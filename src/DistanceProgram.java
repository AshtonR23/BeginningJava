public class DistanceProgram{


        public static void main(String [] args)
    {
        Point p1 = new Point(3,7);
        Point p2 = new Point(-2,-1);


        p1.modify(3);
        p2.setX(7);
        p2.setY(8);

        double distance = Math.sqrt(Math.pow((p1.getX()-p2.getX()),2)) + (Math.pow((p1.getY()-p2.getY()),2));

        System.out.println("point 1 = (" + p1.getX() + ", "+ p1.getY()+ ")");
        System.out.println("point 2 = (" + p2.getX() + ", "+ p2.getY()+ ")");
        System.out.println(" The distance between point 1 and point 2 is " + distance);
    }






}
