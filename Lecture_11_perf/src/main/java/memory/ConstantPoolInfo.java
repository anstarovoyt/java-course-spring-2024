package memory;

import java.util.Map;

public class ConstantPoolInfo {
    public static final int VALUE1 = 12;
    public static final long VALUE2 = 12L;
    public static final String VALUE3 = "hello";
    public static final String VALUE4 = "hello2";
    public static final Map<String, String> VALUE5 = Map.of("hello", "world");

    public static void main(String[] args) {
        System.out.println("Hello: " + VALUE3);
    }
}
