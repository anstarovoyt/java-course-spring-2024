package intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] data = {"one", "two"};
        System.out.println(Arrays.toString(data));

//        data.add("three");
//        data.add("four");

        System.out.println(Arrays.toString(data));
    }

    public static void mainArray(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("one");
        data.add("two");
        System.out.println(data);

        data.add("three");
        data.add("four");
        System.out.println(data);
    }
}
