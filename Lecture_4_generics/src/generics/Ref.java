package generics;

public class Ref<T> {

    private T value;

    public Ref() {
    }

    public Ref(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class MainGenerics {
    public static void main(String[] args) {
        Ref<String> ref = new Ref<String>();
        ref.setValue("hello");

        String stored = ref.getValue();
        System.out.println(stored);


        /*Ref<Integer> ref = new Ref<Integer>();
        ref.setValue(123);

        Integer stored = ref.getValue();
        System.out.println(stored);*/
    }
}
