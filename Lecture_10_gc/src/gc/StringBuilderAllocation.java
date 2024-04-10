package gc;

public class StringBuilderAllocation {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            result.append(String.valueOf(i).repeat(i));
        }

        System.out.println("Result length: " + result.length()
                + ", " + (System.currentTimeMillis() - before) + "ms");
    }
}
