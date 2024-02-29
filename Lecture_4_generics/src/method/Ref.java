package method;


public class Ref<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    static <T> Ref<T> createRef(T value) {
        Ref<T> ref = new Ref<>();
        ref.setValue(value);
        return ref;
    }
}

class MainMethod {
    public static void main(String[] args) {
        Ref<String> ref = Ref.createRef("hello");
        System.out.println(ref.getValue());
    }
}


