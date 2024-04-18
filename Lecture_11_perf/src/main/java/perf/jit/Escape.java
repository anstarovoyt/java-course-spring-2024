package perf.jit;

public class Escape {
    private static class Point {
        private int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void move(int dx, int dy) {
            x += dx;
            y += dy;
        }
    }


    public static void main(String[] args) {
        Point p = new Point(1, 1);
        p.move(2, 2);
        System.out.println("Point moved to (" + p.x + "," + p.y + ")");
    }

    public static void main1(String[] args) {
        int x = 1;
        int y = 1;
        x += 2;
        y += 2;
        System.out.println(x + "," + y);
    }
}
