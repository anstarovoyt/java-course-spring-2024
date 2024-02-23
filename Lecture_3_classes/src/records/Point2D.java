package records;

public record Point2D(int x, int y) {

    public Point2D {
//        System.out.println("Constructed");
    }

    public double distance() {
        return Math.sqrt(x() * x() + y() * y());
    }
}

class RecordMain {
    public static void main(String[] args) {
        var user = new Point2D(1, 2);
        System.out.println(user);

//        System.out.println(user.distance());
    }
}
