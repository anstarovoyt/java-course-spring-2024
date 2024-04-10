package pool;

public class StringsPool {
    public static final String HELLO = "hello";
    public static final String HELLO2 = "hello";

    public static void main(String[] args) {
//        System.out.println("Two constants: " + (HELLO == HELLO2));
//        System.out.println("Self interning: " + (HELLO == HELLO2.intern()));
//        System.out.println("Dynamic + constant: " + (HELLO == he() + llo()));
        System.out.println("Dynamic (intern) + constant: " + (HELLO == (he() + llo()).intern()));
    }

    public static String he() {
        return "he";
    }

    public static String llo() {
        return "llo";
    }
}
