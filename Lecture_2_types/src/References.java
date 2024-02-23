public class References {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(42);
        updateBuilder(builder);
        System.out.println(builder);
    }

    private static void updateBuilder(StringBuilder builder) {
        builder.append(43);
    }
}
