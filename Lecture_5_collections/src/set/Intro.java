package set;

import java.util.ArrayList;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        addUnique(data, "one");
        addUnique(data, "two");
        addUnique(data, "three");
        addUnique(data, "three");
        System.out.println(data);
    }

    private static void addUnique(List<String> data, String el) {
        if (!data.contains(el)) {
            data.add(el);
        }
    }
}
