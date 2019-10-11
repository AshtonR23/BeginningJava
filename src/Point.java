/* Ashton Rischer
9/19/19
Class object point coordinates integers x and y
 */

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 1;
        y = 1;
    }

    public Point(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void modify(int value) {
        x = x * 3;
        y = y * 3;
    }

    public void setY(int y1) {
        y = y1;
    }

    public void setX(int x1) {
        x = x1;
    }

    public void makepoint(int x1, int y1)
    {
        x=x1;
        y=y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int translateX(int addX) {
        x = x + addX;
        return x;
    }

    public int translateY(int addY) {
        y = y + addY;
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow((x - secondPoint.x), 2) + Math.pow((y - secondPoint.y), 2));
    }

    public void drawPoint() {


    }
}











