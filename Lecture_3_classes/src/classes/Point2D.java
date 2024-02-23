package classes;


public class Point2D extends Object {
    private final int x;
    private final int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}


class Main2D {
    public static void main(String[] args) {
        var point = new Point2D(1, 2);
        System.out.println(point);
    }
}
