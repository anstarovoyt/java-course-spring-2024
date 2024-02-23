package classes;

class Point3D extends Point2D {

    private final int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z=" + z;
    }
}

class Main3D {
    public static void main(String[] args) {
        var point = new Point3D(1, 2, 3);
        System.out.println(point);
    }
}
