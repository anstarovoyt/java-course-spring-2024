package statics;

import classes.Point2D;

public class StaticPoint {
    public static final Point2D ZERO = new Point2D(0, 0);

    public static double distance(Point2D point1,
                                  Point2D point2) {
        int x1 = point1.getX();
        int y1 = point1.getY();

        int x2 = point2.getX();
        int y2 = point2.getY();
        return Math.sqrt((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2));
    }

    private static int x = 0;
    private static int y = 1;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }
}

class MainStaticPoint {
    public static void main(String[] args) {
        System.out.println(StaticPoint.getX());
        System.out.println(StaticPoint.getY());
    }
}



