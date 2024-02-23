package classes;

class Point3DVisibility extends Point2DVisibility {

    private final int z;

    public Point3DVisibility(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void test() {
//        System.out.println(this.x);
        System.out.println(this.getX());
        System.out.println(this.isZero());
        System.out.println(this.getY());
    }

    @Override
    protected boolean isZero() {
        return super.isZero() && z == 0;
    }
}

class MainVisibility {
    public static void main(String[] args) {
        Point2DVisibility point2DVisibility = new Point2DVisibility(1, 2);
        System.out.println(point2DVisibility.isZero());
        System.out.println(point2DVisibility.getX());
        System.out.println(point2DVisibility.getY());
    }
}
