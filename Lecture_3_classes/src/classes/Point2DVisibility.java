package classes;

public class Point2DVisibility {
    private final int x;
    private final int y;

    int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected boolean isZero() {
        return getX() == 0 && getY() == 0;
    }

    public Point2DVisibility(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

