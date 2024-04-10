package gc;

public class StringAllocation {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += String.valueOf(i).repeat(i);
        }

        System.out.println("Result length: " + result.length()
                + ", " + (System.currentTimeMillis() - before) + "ms");
    }
}
