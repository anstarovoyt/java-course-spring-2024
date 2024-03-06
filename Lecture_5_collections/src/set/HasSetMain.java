package set;

import java.util.HashSet;

public class HasSetMain {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("one");
        data.add("two");
        data.add("three");
        data.add("three");
        System.out.println(data);
    }
}
