package abstracts;


public abstract class Point2D {
    abstract int getX();

    abstract int getY();

    double distance() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    @Override
    public String toString() {
        return "x=" + getX() + ", y=" + getY();
    }
}

class ZeroPoint extends Point2D {
    @Override
    int getX() {
        return 0;
    }

    @Override
    int getY() {
        return 0;
    }
}

class DefaultPoint2D extends Point2D {
    private final int x;
    private final int y;

    public DefaultPoint2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Point2DMain {

    public static void main(String[] args) {
        System.out.println(new ZeroPoint());
        System.out.println(new DefaultPoint2D(1, 2));

//        System.out.println(new Point2D());

//        System.out.println(new Point2D() {
//            @Override
//            int getX() {  return 0; }
//            @Override
//            int getY() { return 0; }
//        });
    }
}
