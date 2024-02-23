package sealed;

public abstract sealed class Point2D
        permits ZeroPoint2D, DefaultPoint2D {
    abstract int getX();

    abstract int getY();
}

final class ZeroPoint2D extends Point2D {
    @Override
    int getX() {
        return 0;
    }

    @Override
    int getY() {
        return 0;
    }
}

final class DefaultPoint2D extends Point2D {
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
